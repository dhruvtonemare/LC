# LeetCode Auto-Publish

Publishes one LeetCode solution per day to this repo, automatically, using GitHub Actions.
No local machine needs to stay running — GitHub's servers run the schedule.

## Setup (one-time)

1. Create a new GitHub repo (or use an existing one) and clone it locally.
2. Copy these three things into the repo root:
   - `scripts/publish_next.sh`
   - `.github/workflows/daily-publish.yml`
   - an empty `queue/` folder and an empty `solutions/` folder
3. Drop **all 350+ of your solution files** into `queue/`.
   - Name them so they sort in the order you want them published, e.g.:
     `0001-two-sum.py`, `0002-add-two-numbers.py`, `0053-maximum-subarray.py`, etc.
   - Numeric prefixes keep `sort` ordering correct even past 9999 problems.
4. Commit and push:
   ```bash
   git add .
   git commit -m "Set up auto-publish queue"
   git push
   ```
5. In your repo on GitHub: **Settings → Actions → General → Workflow permissions** →
   select "Read and write permissions". This lets the Action push commits.
6. That's it. Starting tomorrow (or immediately if you trigger it manually), one file
   moves from `queue/` to `solutions/` per day, committed with a real timestamp.

## Testing it right now

Go to the **Actions** tab → "Daily LeetCode Publish" → **Run workflow** button.
This runs it once immediately so you can confirm it works, instead of waiting a full day.

## Changing the schedule

Edit the `cron` line in `.github/workflows/daily-publish.yml`.
Cron is in UTC. Examples:
- `0 9 * * *` → every day at 9:00 UTC
- `0 0 * * *` → every day at midnight UTC
- `0 9 */2 * *` → every 2 days (if you'd rather go slower)

## Notes

- This publishes going forward from whenever you set it up — it does **not** rewrite
  git history or fake past dates. Each commit's date is the real day it ran.
- `published.log` keeps a running record of what's gone out and when.
- If you ever want to publish an extra one manually, just use the "Run workflow" button
  in the Actions tab — it's safe to run more than once, it'll just take the next file.
