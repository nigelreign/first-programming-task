<% String menus[][][] = (String[][][]) request.getAttribute("menus"); %>

<!DOCTYPE html>
<html>
  <head>
    <%-- Get title from session --%>
    <title>${page_title}</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
      <%@include file="/WEB-INF/css/style.css"%>
    </style>
  </head>
  <body>
    <div class="header-bar">
      <h1>${page_title}</h1>
    </div>
    <div class="navbar">
        <%-- Loop through the menus --%>
        <% for (int i = 0; i < menus.length; i++) { %>
 
            <%-- check if menu contains 1 item --%> 
            <% if (menus[i].length == 1){ %> 
    
                <%-- Get the item name and item link --%>
                <a target='blank' href="<%= menus[i][0][1] %>"><%= menus[i][0][0] %> </a>

                <%-- check if menu contains more than 1 item --%>
                <%} else if(menus[i].length > 1){ %>
                    <div class="subnav">
                        <button class="subnavbtn">
                            <%= menus[i][0][0] %> <i class="fa fa-caret-down"></i>
                        </button>
                        
                        <div class="subnav-content">
                         <%-- get the menu items  --%>
                        <% for (int j = 1; j < menus[i].length; j++) { %>
                                <a target='blank' href="<%= menus[i][j][1] %>"><%= menus[i][j][0] %></a>
                            <%  } %>
                        </div>
                    </div>
                <% }
        } %>
    </div>
  </body>
</html>
