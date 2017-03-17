# JSPServletC3P0

JavaWeb Maven Project, JSP/Servlet/C3P0/Ajax/MySQL MVC Development Framework.

基于Maven构建的JavaWeb项目，JSP/Servlet/C3P0/Ajax/MySQL 框架，实现了会员管理功能，编写了万能DBUtil类/Filter验证登录类，MVC开发模式与面向接口编程，还包含日期控件My97DatePicker，EL自定义函数，隐藏域等等。

# Development Tools

IntelliJ IDEA

# Database

MySQL数据库字符集utf8，默认排序规则utf8_general_ci

1.用户信息表user

| 表字段 | 类型 | 是否为空 | 默认值 | 说明 |
|:------ |:------ |:------ |:------ |:------ |
| id | int(11) | No |  | 自增id |
| user_id | varchar(50) | No |  | 登录账号 |
| user_pass | varchar(50) | No |  | 登录密码 |
| user_name | varchar(50) | No |  | 真实姓名 |
| user_telephone | varchar(50) | No |  | 联系电话 |
| user_birthday | varchar(50) | No |  | 出生日期 |
| user_answer | varchar(255) | Yes |  | 密保答案 |
| user_faq | int(50) | Yes |  | 密保问题 |
| user_city | varchar(255) | No |  | 所在城市 |
| user_creator | varchar(50) | No |  | 推荐人 |
| create_time | bigint(20) | No |  | 创建时间戳 |

2.系统设置表sys

| 表字段 | 类型 | 是否为空 | 默认值 | 说明 |
|:------ |:------ |:------ |:------ |:------ |
| id | int(11) | No |  | 自增id |
| user_min | int(11) | No | 0 | 最小人数 |
| user_max | int(11) | No | 0 | 最大人数 |

# Preview

![](https://raw.githubusercontent.com/smartbetter/JSPServletC3P0/master/website/static/screenshot1.png)
![](https://raw.githubusercontent.com/smartbetter/JSPServletC3P0/master/website/static/screenshot2.png)
![](https://raw.githubusercontent.com/smartbetter/JSPServletC3P0/master/website/static/screenshot3.png)

# License

	Copyright 2016 smartbetter

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
