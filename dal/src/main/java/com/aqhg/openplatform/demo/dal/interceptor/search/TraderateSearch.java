package com.aqhg.openplatform.demo.dal.interceptor.search;

import com.aqhg.openplatform.demo.dal.interceptor.search.base.PageSearch;
import lombok.Data;

@Data
public class TraderateSearch extends PageSearch {

    private Long itemId;

    private Long uid;

}
