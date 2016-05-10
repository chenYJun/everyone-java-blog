/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.blog.dao;

import com.zuoxiaolong.blog.mapper.WebUserMapper;
import com.zuoxiaolong.blog.model.WebUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Xiaolong Zuo
 * @since 1.0.0
 */
public class WebUserMapperTest extends AbstractSpringContextTest {

    @Autowired
    private WebUserMapper webUserMapper;

    @Test
    public void insert() {
        Assert.assertNotNull(webUserMapper);
        WebUser user = new WebUser();
        user.setUsername("zuoxiaolong");
        user.setPassword("123456");
        webUserMapper.insert(user);
        Assert.assertNotNull(webUserMapper.selectByPrimaryKey(1));
    }

}
