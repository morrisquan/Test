/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-20 06:01:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\n");
      out.write("    <!--[if IE 6]>\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\n");
      out.write("    <script>DD_belatedPNG.fix('*');</script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <title>编辑管理员</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<article class=\"page-container\">\n");
      out.write("    <form class=\"form form-horizontal\" id=\"form-admin-add\">\n");
      out.write("        <input type=\"text\" hidden value=\"\" placeholder=\"\" id=\"id\" name=\"id\">\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>管理员：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\n");
      out.write("                <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"username\" name=\"username\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>性别：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9 skin-minimal\">\n");
      out.write("                <div class=\"radio-box\">\n");
      out.write("                    <input name=\"sex\" value=\"男\" type=\"radio\" id=\"sex-1\" checked>\n");
      out.write("                    <label for=\"sex-1\">男</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"radio-box\">\n");
      out.write("                    <input type=\"radio\" value=\"女\" id=\"sex-2\" name=\"sex\">\n");
      out.write("                    <label for=\"sex-2\">女</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>手机：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\n");
      out.write("                <input type=\"text\" class=\"input-text\" value=\"\" placeholder=\"\" id=\"phone\" name=\"phone\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\"><span class=\"c-red\">*</span>邮箱：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\n");
      out.write("                <input type=\"text\" class=\"input-text\" placeholder=\"@\" name=\"email\" id=\"email\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\">角色：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\n");
      out.write("                <select id=\"select\" name=\"roleId\" class=\"select-box\" style=\"width:150px;\">\n");
      out.write("\n");
      out.write("\t\t\t    </select>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <label class=\"form-label col-xs-4 col-sm-3\">备注：</label>\n");
      out.write("            <div class=\"formControls col-xs-8 col-sm-9\">\n");
      out.write("                <textarea id=\"description\" name=\"description\" cols=\"\" rows=\"\" class=\"textarea\" placeholder=\"说点什么...100个字符以内\" dragonfly=\"true\"></textarea>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row cl\">\n");
      out.write("            <div class=\"col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3\">\n");
      out.write("                <input id=\"saveButton\" class=\"btn btn-primary radius\" type=\"submit\" value=\"&nbsp;&nbsp;提交&nbsp;&nbsp;\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("<!--_footer 作为公共模版分离出去-->\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\n");
      out.write("\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/jquery.validate.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/validate-methods.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.validation/1.14.0/messages_zh.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    $(\"#id\").val(parent.userId);\n");
      out.write("    $(\"#username\").val(parent.username);\n");
      out.write("    $(\"#phone\").val(parent.phone);\n");
      out.write("    $(\"#email\").val(parent.email);\n");
      out.write("    $(\"#description\").val(parent.description);\n");
      out.write("    var roleNames=parent.roleNames;\n");
      out.write("    var sex=parent.sex;\n");
      out.write("    if(sex=='女'){\n");
      out.write("        $(\"#sex-2\").attr('checked', 'checked');\n");
      out.write("        radioCheck();\n");
      out.write("    }else{\n");
      out.write("        $(\"#sex-1\").attr('checked', 'checked');\n");
      out.write("        radioCheck();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    var index = layer.load(3);\n");
      out.write("    $.ajax({\n");
      out.write("        url:\"/user/getAllRoles\",\n");
      out.write("        type: 'GET',\n");
      out.write("        success:function (data) {\n");
      out.write("            layer.close(index);\n");
      out.write("            if(data.success==true){\n");
      out.write("                var size=data.result.length;\n");
      out.write("                for(var i=0;i<size;i++){\n");
      out.write("                    if(data.result[i].name==roleNames.trim()){\n");
      out.write("                        $(\"#select\").append(\"<option selected value=\"+data.result[i].id+\">\"+data.result[i].name+\"</option>\");\n");
      out.write("                    }else{\n");
      out.write("                        $(\"#select\").append(\"<option value=\"+data.result[i].id+\">\"+data.result[i].name+\"</option>\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }else {\n");
      out.write("                layer.alert(data.message, {title: '错误信息', icon: 2});\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        error:function(XMLHttpRequest){\n");
      out.write("            layer.close(index);\n");
      out.write("            layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    /*文本输入限制*/\n");
      out.write("    $(\".textarea\").Huitextarealength({\n");
      out.write("        minlength:0,\n");
      out.write("        maxlength:100\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function radioCheck(){\n");
      out.write("        $('.skin-minimal input').iCheck({\n");
      out.write("            checkboxClass: 'icheckbox-blue',\n");
      out.write("            radioClass: 'iradio-blue',\n");
      out.write("            increaseArea: '20%'\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(function(){\n");
      out.write("        radioCheck();\n");
      out.write("\n");
      out.write("        $(\"#form-admin-add\").validate({\n");
      out.write("            rules:{\n");
      out.write("                username:{\n");
      out.write("                    required:true,\n");
      out.write("                    minlength:1,\n");
      out.write("                    maxlength:16,\n");
      out.write("                    remote: \"/user/edit/username/\"+parent.userId\n");
      out.write("                },\n");
      out.write("                sex:{\n");
      out.write("                    required:true,\n");
      out.write("                },\n");
      out.write("                phone:{\n");
      out.write("                    required:true,\n");
      out.write("                    isPhone:true,\n");
      out.write("                    remote: \"/user/edit/phone/\"+parent.userId\n");
      out.write("                },\n");
      out.write("                email:{\n");
      out.write("                    required:true,\n");
      out.write("                    email:true,\n");
      out.write("                    remote: \"/user/edit/email/\"+parent.userId\n");
      out.write("                },\n");
      out.write("                roleId:{\n");
      out.write("                    required:true,\n");
      out.write("                },\n");
      out.write("            },\n");
      out.write("            messages: {\n");
      out.write("                username: {\n");
      out.write("                    remote: \"该用户名已被注册\"\n");
      out.write("                },\n");
      out.write("                phone: {\n");
      out.write("                    remote: \"该手机号已被注册\"\n");
      out.write("                },\n");
      out.write("                email: {\n");
      out.write("                    remote: \"该邮箱已被注册\"\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            onkeyup:false,\n");
      out.write("            focusCleanup:false,\n");
      out.write("            success:\"valid\",\n");
      out.write("            submitHandler:function(form){\n");
      out.write("                var index = layer.load(3);\n");
      out.write("                $(form).ajaxSubmit({\n");
      out.write("                    url: \"/user/updateUser\",\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    success: function (data) {\n");
      out.write("                        layer.close(index);\n");
      out.write("                        if (data.success == true) {\n");
      out.write("                            parent.refresh();\n");
      out.write("                            parent.msgSuccess(\"编辑成功!\");\n");
      out.write("                            var index = parent.layer.getFrameIndex(window.name);\n");
      out.write("                            parent.layer.close(index);\n");
      out.write("                        } else {\n");
      out.write("                            layer.alert(data.message, {title: '错误信息', icon: 2});\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function (XMLHttpRequest) {\n");
      out.write("                        layer.close(index);\n");
      out.write("                        layer.alert('数据处理失败! 错误码:' + XMLHttpRequest.status, {\n");
      out.write("                            title: '错误信息',\n");
      out.write("                            icon: 2\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<!--/请在上方写此页面业务相关的脚本-->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}