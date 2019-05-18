/*
 * Copyright (c) 2019.
 * Generate By Corentin Roux.
 * All rights reserved.
 */

package prototype;

public class CookieMachine {

    private Cookie cookie; //type coconut

    public CookieMachine(Cookie cookie){
        this.cookie = cookie; //clone les coconuts
    }

    public Cookie makeCookie()
    {
        return cookie.clone();
    }

    public static void main(String args[])
    {
        Cookie        tempCookie =  null;
        Cookie        prot       = new CoconutCookie();
        CookieMachine cm         = new CookieMachine(prot);

        for (int i=0; i<100; i++)
        {
            tempCookie = cm.makeCookie();
            System.out.println(tempCookie);
        }
    }


}
