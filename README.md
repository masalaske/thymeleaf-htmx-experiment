# thymeleaf-htmx-experiment
Experiment Thymeleaf and HTMX

https://htmx.org/docs/

# Goal

Add modern interactivity features directly in HTML

# Key points
- HTMX is small
- Dependency-free
- Quick to pick up 
- Less context-switch
- No need for JavaScript Code (though it's written in JavaScript and you have to enable it in the Browser)
- Less code and simplicity (no fetch, no use effect, no state management compared to React)
- Might be good in teams where you have "backend-only" people, for smaller projects
- With HTMX specific parts of the document are only be rendered, not the full document
- SPA-like experience which is only driven by the server, not the client

# Use Cases
- Modernization of old MVC applications, without the need to go for a SPA (and customer likely won't pay for it)
https://surferjeff.medium.com/convert-an-asp-net-website-into-a-spa-using-htmx-1274ae0d8be8

# Further resources
https://htmx.org/examples/#ui-examples

# Conclusion
HTMX is yet another option to consider for certain scenarios. It should not be seen as "replacement" of SPA