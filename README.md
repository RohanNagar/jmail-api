# JMail API

A REST API to perform email address validation
using the [JMail](https://www.rohannagar.com/jmail) algorithm.

`jmail-api` is deployed on Heroku.

### Deploy to Heroku

Use the `Deploy API` Github Action to deploy the current
master branch to Heroku.

The current master is also deployed automatically on every
push to master (excluding pushes from the `github-actions` bot,
like merging Dependabot pull requests).

### View Heroku Logs

```bash
$ heroku logs --tail -a jmail-api
```