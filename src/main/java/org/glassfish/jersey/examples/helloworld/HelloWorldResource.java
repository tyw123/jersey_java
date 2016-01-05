/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2010-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.glassfish.jersey.examples.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;



/**
 *
 * @author Jakub Podlesak (jakub.podlesak at oracle.com)
 */
@Path("helloworld")
public class HelloWorldResource {
    public static final String CLICHED_MESSAGE = "Hello World!";





  //  HashMap<String , ArrayList> allitems = new HashMap<String , ArrayList>();
//    HashMap<String , String> items_2 = new HashMap<String , String>();
//    HashMap<String , String> items_3 = new HashMap<String , String>();
//    HashMap<String , String> items_4 = new HashMap<String , String>();
//    HashMap<String , String> items_5 = new HashMap<String , String>();
//    HashMap<String , String> items_6 = new HashMap<String , String>();
//不能在这里用put函数，此处只能进行函数声明和调用初始化/构造函数
  //  ArrayList allitems = new ArrayList();

    @Path("/")
    @GET
    @Produces("text/plain")
    public String getHello() {
        return CLICHED_MESSAGE;
    }


//    public static final String forsave = " [\n" +
//            "            'ITEM000000',\n" +
//            "            'ITEM000001',\n" +
//            "            'ITEM000005'\n" +
//            "        ]";

    HashMap forsave=new HashMap();
    ArrayList promo=new ArrayList();
    @Path("/promotion")
    @GET
    @Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
    public HashMap test() {
        promo.add("ITEM000000");
        promo.add("ITEM000001");
        promo.add("ITEM000005");
        forsave.put("type","BUY_TWO_GET_ONE_FREE");
        forsave.put("barcode",promo);
        return forsave;
    }


//    public static final String tt = " World!";
//    @Path("/test")
//    @GET
//    @Produces("text/plain")
//    public String haha() {
//        return tt;
//    }

    HashMap coca=new HashMap();
    HashMap  sprite=new HashMap();
    HashMap  apple=new HashMap();
    HashMap  litchi=new HashMap();
    HashMap  noodles=new HashMap();
    HashMap  battery=new HashMap();
    ArrayList allItems=new ArrayList();
    @Path("/all_item")
    @GET
    @Produces(MediaType.APPLICATION_JSON+";charset=utf-8")
    public ArrayList allItems() {

        coca.put("barcode","ITEM000000");
        coca.put("name", "可口可乐");
        coca.put("unit", "瓶");
        coca.put( "price", 3.00);

        sprite.put( "barcode","ITEM000001") ;
        sprite.put("name", "雪碧");
        sprite.put("unit", "瓶");
        sprite.put("price",3.00);

        apple.put("barcode","ITEM000002");
        apple.put("name","苹果");
        apple.put("unit","斤");
        apple.put("price",5.50);

        litchi.put("barcode", "ITEM000003");
        litchi.put("name","荔枝");
        litchi.put( "unit","斤");
        litchi.put("price",15.00);

        battery.put("barcode","ITEM000004");
        battery.put("name","电池");
        battery.put("unit","个");
        battery.put( "price", 2.00);

        noodles.put("barcode","ITEM000005");
        noodles.put("name","方便面");
        noodles.put("unit","袋");
        noodles.put("price",4.50);

        allItems.add(coca);
        allItems.add(sprite);
        allItems.add(apple);
        allItems.add(litchi);
        allItems.add(noodles);


        return allItems;

     //   return allitems;
    }

}
