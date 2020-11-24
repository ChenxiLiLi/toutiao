package com.bytedance.toutiao.base;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.bytedance.toutiao.bean.MessageCommentModel;
import com.bytedance.toutiao.bean.MsgFocusModel;
import com.bytedance.toutiao.bean.NewsModel;
import com.bytedance.toutiao.bean.PostDetailModel;
import com.bytedance.toutiao.bean.Resource;
import com.bytedance.toutiao.bean.SearchCityModel;
import com.bytedance.toutiao.bean.SearchFriendModel;
import com.bytedance.toutiao.bean.SearchHotModel;
import com.bytedance.toutiao.bean.User;
import com.bytedance.toutiao.bean.VideoModel;

import java.util.HashMap;
import java.util.List;

import static com.bytedance.toutiao.retrofit.RetrofitManager.getApiService;

/**
 * Data : 2020/10/28
 * Time : 16:38
 * Author : 刘朝阳
 */
public class RepositoryImpl extends BaseModel {

    public MutableLiveData<Resource<User>> login(HashMap<String, String> map) {
        MutableLiveData<Resource<User>> liveData = new MutableLiveData<>();
        return observe(getApiService().login(map), liveData);
    }

    public MutableLiveData<Resource<User>> register(HashMap<String, String> map) {
        MutableLiveData<Resource<User>> liveData = new MutableLiveData<>();
        return observe(getApiService().register(map), liveData);
    }

    //获取推荐视频列表
        public MutableLiveData<Resource<List<VideoModel>>> getRecommentVideos() {
            MutableLiveData<Resource<List<VideoModel>>> liveData = new MutableLiveData<>();
            return observe(getApiService().getRecommentVideos(), liveData);
    }

    //获取资讯列表
    public MutableLiveData<Resource<List<NewsModel>>> listNews(String type) {
        MutableLiveData<Resource<List<NewsModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().listNews(type), liveData);
    }

    //获取单条资讯详情
    public MutableLiveData<Resource<NewsModel>> newsDetail(String id) {
        MutableLiveData<Resource<NewsModel>> liveData = new MutableLiveData<>();
        return observe(getApiService().newsDetail(id), liveData);
    }

    //获取信息模块关注列表
    public MutableLiveData<Resource<List<MsgFocusModel>>> getMsgFocus() {
        MutableLiveData<Resource<List<MsgFocusModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getMsgFocus(), liveData);
    }

    //获取信息模块评论列表
    public MutableLiveData<Resource<List<MessageCommentModel>>> getMsgComments() {
        MutableLiveData<Resource<List<MessageCommentModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getMsgComments(), liveData);
    }

    //获取搜索模块热搜榜列表
    public MutableLiveData<Resource<List<SearchHotModel>>> getSearchHot() {
        MutableLiveData<Resource<List<SearchHotModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getSearchHot(), liveData);
    }

    //获取搜索模块同城榜列表
    public MutableLiveData<Resource<List<SearchCityModel>>> getSearchCity() {
        MutableLiveData<Resource<List<SearchCityModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getSearchCity(), liveData);
    }

    //获取搜索模块好友榜列表
    public MutableLiveData<Resource<List<SearchFriendModel>>> getSearchFriend() {
        MutableLiveData<Resource<List<SearchFriendModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getSearchFriend(), liveData);
    }


    //获取帖子
    public MutableLiveData<Resource<List<PostDetailModel>>> getPostByEventId(String eventId) {
        MutableLiveData<Resource<List<PostDetailModel>>> liveData = new MutableLiveData<>();
        return observe(getApiService().getPostsByEventId(eventId), liveData);
    }


}
