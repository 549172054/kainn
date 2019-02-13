## 分页拦截器

### 

`PageInterceptor` 会在`Pre`阶段拦截以` ByPage` 结尾的Mybatis方法,并将结果返回在继承了`PageSearch`的分页参数类里;

### Example
如 XXMapper 中有以下方法:

`List<User> SelectListByPageSearch(@Param('map')UserSearch search)`

则可以在XXXService中:

` return search.getPageInfo(list); `

得以返回分页参数;
