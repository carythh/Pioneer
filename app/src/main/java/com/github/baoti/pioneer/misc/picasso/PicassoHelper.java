/*
 * Copyright (c) 2014-2015 Sean Liu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.baoti.pioneer.misc.picasso;

import com.github.baoti.pioneer.entity.ImageBean;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Created by liuyedong on 2014/12/26.
 */
public class PicassoHelper {
    public static RequestCreator load(Picasso picasso) {
        return picasso.load((String) null);
    }

    public static RequestCreator load(Picasso picasso, ImageBean imageBean) {
        if (imageBean == null) {
            return load(picasso);
        }
        return picasso.load(imageBean.getUrl());
    }
}
