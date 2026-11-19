## Approach

Mobile stores the submitted query in the current search route (replace, not a new entry), and uses a request generation plus abort to isolate retired reads. Opening a playlist goes through the same detail route as home and can return to search. Desktop surfaces submitted criteria, loading, partial/error messages, actionable retries, and native keyboard controls. Keep changes within the existing route and player slot contracts.
