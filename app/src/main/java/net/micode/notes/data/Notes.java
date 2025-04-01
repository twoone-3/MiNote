/*
 * Copyright (c) 2010-2011, The MiCode Open Source Community (www.micode.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.micode.notes.data;

import android.net.Uri;

public class Notes {
    // 定义内容提供者的权限
    public static final String AUTHORITY = "micode_notes";
    public static final String TAG = "Notes";
    
    // 定义笔记的类型
    public static final int TYPE_NOTE = 0;
    public static final int TYPE_FOLDER = 1;
    public static final int TYPE_SYSTEM = 2;

    /**
     * 以下ID是系统文件夹的标识符
     * {@link Notes#ID_ROOT_FOLDER } 默认文件夹
     * {@link Notes#ID_TEMPARAY_FOLDER } 存放不属于任何文件夹的笔记
     * {@link Notes#ID_CALL_RECORD_FOLDER} 存储通话记录
     */
    public static final int ID_ROOT_FOLDER = 0;
    public static final int ID_TEMPARAY_FOLDER = -1;
    public static final int ID_CALL_RECORD_FOLDER = -2;
    public static final int ID_TRASH_FOLER = -3;

    // 定义Intent的额外参数的键
    public static final String INTENT_EXTRA_ALERT_DATE = "net.micode.notes.alert_date";
    public static final String INTENT_EXTRA_BACKGROUND_ID = "net.micode.notes.background_color_id";
    public static final String INTENT_EXTRA_WIDGET_ID = "net.micode.notes.widget_id";
    public static final String INTENT_EXTRA_WIDGET_TYPE = "net.micode.notes.widget_type";
    public static final String INTENT_EXTRA_FOLDER_ID = "net.micode.notes.folder_id";
    public static final String INTENT_EXTRA_CALL_DATE = "net.micode.notes.call_date";

    // 定义小部件的类型
    public static final int TYPE_WIDGET_INVALIDE = -1;
    public static final int TYPE_WIDGET_2X = 0;
    public static final int TYPE_WIDGET_4X = 1;

    public static class DataConstants {
        public static final String NOTE = TextNote.CONTENT_ITEM_TYPE;
        public static final String CALL_NOTE = CallNote.CONTENT_ITEM_TYPE;
    }

    /**
     * 查询所有笔记和文件夹的Uri
     */
    public static final Uri CONTENT_NOTE_URI = Uri.parse("content://" + AUTHORITY + "/note");

    /**
     * 查询数据的Uri
     */
    public static final Uri CONTENT_DATA_URI = Uri.parse("content://" + AUTHORITY + "/data");

    public interface NoteColumns {
        /**
         * 唯一ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String ID = "_id";

        /**
         * 笔记或文件夹的父ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String PARENT_ID = "parent_id";

        /**
         * 创建日期
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String CREATED_DATE = "created_date";

        /**
         * 最后修改日期
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String MODIFIED_DATE = "modified_date";


        /**
         * 提醒日期
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String ALERTED_DATE = "alert_date";

        /**
         * 文件夹的名称或笔记的文本内容
         * <P> 类型: TEXT </P>
         */
        public static final String SNIPPET = "snippet";

        /**
         * 笔记的小部件ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String WIDGET_ID = "widget_id";

        /**
         * 笔记的小部件类型
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String WIDGET_TYPE = "widget_type";

        /**
         * 笔记的背景颜色ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String BG_COLOR_ID = "bg_color_id";

        /**
         * 对于文本笔记，没有附件；对于多媒体笔记，至少有一个附件
         * <P> 类型: INTEGER </P>
         */
        public static final String HAS_ATTACHMENT = "has_attachment";

        /**
         * 文件夹中的笔记数量
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String NOTES_COUNT = "notes_count";

        /**
         * 文件类型: 文件夹或笔记
         * <P> 类型: INTEGER </P>
         */
        public static final String TYPE = "type";

        /**
         * 最后同步ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String SYNC_ID = "sync_id";

        /**
         * 标志本地是否已修改
         * <P> 类型: INTEGER </P>
         */
        public static final String LOCAL_MODIFIED = "local_modified";

        /**
         * 移动到临时文件夹之前的原始父ID
         * <P> 类型 : INTEGER </P>
         */
        public static final String ORIGIN_PARENT_ID = "origin_parent_id";

        /**
         * gtask ID
         * <P> 类型 : TEXT </P>
         */
        public static final String GTASK_ID = "gtask_id";

        /**
         * 版本代码
         * <P> 类型 : INTEGER (long) </P>
         */
        public static final String VERSION = "version";
    }

    public interface DataColumns {
        /**
         * 唯一ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String ID = "_id";

        /**
         * 项目的MIME类型
         * <P> 类型: Text </P>
         */
        public static final String MIME_TYPE = "mime_type";

        /**
         * 笔记的引用ID
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String NOTE_ID = "note_id";

        /**
         * 创建日期
         * <P> 类型: INTEGER (long) </P>
         */
        public static final String* ▋
