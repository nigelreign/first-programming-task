package com.test.nigelreign.nigelreignjsp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {

        // ======================================================================================================
        // Set page title in session
        // ======================================================================================================

        HttpSession session = request.getSession();
        session.setAttribute("page_title", "Nigel Zulu | JSP");

        // ======================================================================================================
        // End of set page title in session
        // ======================================================================================================
        // ::Task => create a three dimensional array of menus with sub menus
        // pass the array to the view
        String[][][] menus = new String[][][] {
                { { "Facebook", "https://www.facebook.com/" } },
                { { "Github" }, { "My Github", "https://github.com/nigelreign" },
                        { "Multiple Map Markers", "https://github.com/nigelreign/multiple-map-markers" },
                        { "PACS Server", "https://github.com/nigelreign/PACS-Server" },
                        { "PDF Generator", "https://github.com/nigelreign/pdf-generator" } },
                { { "Socials" }, { "Facebook", "https://www.facebook.com/" }, { "Twitter", "https://twitter.com/" },
                        { "Tik Tok", "https://www.tiktok.com/en/" },
                        { "Instagram", "https://www.instagram.com/" },
                        { "Instagram", "https://www.instagram.com/" },
                        { "Instagram", "https://www.instagrssssssssam.com/" },
                        { "Instagram", "https://www.instagram.com/" } },
                { { "Figjam", "https://www.figjammobile.com/" } },
        };

        request.setAttribute("menus", menus);

        return "index";
    }
}
