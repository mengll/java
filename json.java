

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class ParseJsonParse {

}



public class ParseJson {
    public static class VO {
        private int id;
        private Map<String, Object> attributes = new HashMap<String, Object>();
        public int getId() { return id; }
        public void setId(int id) { this.id = id;}
        public Map<String, Object> getAttributes() { return attributes;}

        @Override
        public String toString() {
            return "VO{" +
                    "id=" + id +
                    ", attributes=" + attributes +
                    '}';
        }
    }

    public HashMap plan = new HashMap<String,String>();
    public HashMap mediaMap;

    {
        HashMap<String, HashMap> MapHashMap = new HashMap<>();
        mediaMap = MapHashMap;
        mediaMap.put("1_plan",
                new HashMap<String,String>().put("",""));
    }

    public void parse(){
        String plan_msg  = "{\"code\": 0, \"message\": \"OK\", \"request_id\": \"2021090210393101015016819414002659\", \"data\": {\"page_info\": {\"total_number\": 1, \"total_page\": 1, \"page\": 1, \"page_size\": 20}, \"list\": [{\"advanced_creative_phone_click\": 0, \"attribution_wechat_login_30d_count\": 0, \"next_day_open_rate\": 0.0, \"phone_effective\": 0, \"luban_live_share_cnt\": 0, \"phone_confirm\": 0, \"campaign_name\": null, \"message\": 0, \"luban_live_pay_order_stat_cost\": 0.0, \"consult_effective\": 0, \"avg_click_cost\": 32.23, \"active_pay_cost\": 977.61, \"attribution_game_pay_7d_cost\": 225.60128205128206, \"wechat_login_cost\": 0.0, \"download_finish_rate\": 0.0, \"pre_convert_count\": 43, \"luban_live_gift_cnt\": 0, \"home_visited\": 75, \"id\": null, \"pay_count\": 9, \"advanced_creative_coupon_addition\": 0, \"luban_order_roi\": 0.0, \"attribution_wechat_pay_30d_roi\": 0.0, \"ad_name\": null, \"total_play\": 14958, \"valid_play\": 1587, \"lottery\": 0, \"wechat_first_pay_cost\": 0.0, \"first_rental_order_count\": 0.0, \"click_shopwindow\": 0, \"advanced_creative_form_click\": 0, \"download_finish\": 0, \"advanced_creative_form_submit\": 0, \"location_click\": 0, \"attribution_wechat_first_pay_30d_rate\": 0.0, \"pre_loan_credit_cost\": 0.0, \"wechat_pay_amount\": 0.0, \"loan_completion_rate\": 0.0, \"loan_completion_cost\": 0.0, \"advanced_creative_counsel_click\": 0, \"click\": 273, \"wechat_first_pay_rate\": 0.0, \"attribution_next_day_open_cost\": 0.0, \"average_play_time_per_play\": 4.96, \"wechat_login_count\": 0, \"install_finish\": 0, \"consult\": 0, \"poi_address_click\": 0, \"wifi_play\": 10029, \"loan_credit_rate\": 0.0, \"install_finish_cost\": 0.0, \"play_over_rate\": 3.65, \"ies_music_click\": 0, \"active_pay_rate\": 11.54, \"convert_cost\": 977.61, \"submit_certification_count\": 0.0, \"play_75_feed_break\": 922, \"attribution_wechat_first_pay_30d_count\": 0, \"luban_order_stat_amount\": 0.0, \"pre_loan_credit\": 0, \"attribution_active_pay_7d_per_count\": 4, \"phone\": 0, \"next_day_open_cost\": 0.0, \"attribution_convert_cost\": 977.61, \"download_start\": 0, \"click_download\": 0, \"attribution_deep_convert\": 0, \"active_register_rate\": 98.72, \"commute_first_pay_count\": 0.0, \"redirect_to_shop\": 0, \"game_pay_count\": 71, \"ctr\": 1.69, \"install_finish_rate\": 0.0, \"in_app_order\": 0, \"live_fans_club_join_cnt\": 0, \"click_call_dy\": 0, \"map_search\": 0, \"wifi_play_rate\": 67.05, \"convert_rate\": 3.3, \"coupon_single_page\": 0, \"game_pay_cost\": 123, \"avg_show_cost\": 546.15, \"convert\": 9, \"attribution_deep_convert_cost\": 0.0, \"register\": 77, \"form\": 0, \"play_50_feed_break\": 1149, \"like\": 7, \"pre_convert_rate\": 15.75, \"button\": 0, \"game_addiction_cost\": 0.0, \"vote\": 0, \"first_order_count\": 0.0, \"luban_order_cnt\": 0, \"cost\": 8798.45, \"live_watch_one_minute_count\": 0, \"attribution_game_pay_7d_count\": 39, \"loan_credit\": 0, \"valid_play_rate\": 9.85, \"deep_convert\": 0, \"download_start_cost\": 0.0, \"wechat_first_pay_count\": 0, \"ad_id\": null, \"luban_live_follow_cnt\": 0, \"in_app_detail_uv\": 0, \"attribution_next_day_open_rate\": 0.0, \"in_app_cart\": 0, \"deep_convert_rate\": 0.0, \"loan_completion\": 0, \"click_install\": 0, \"loan_credit_cost\": 0.0, \"attribution_wechat_pay_30d_amount\": 0.0, \"message_action\": 0, \"attribution_convert\": 9, \"view\": 0, \"in_app_uv\": 0, \"game_addiction_rate\": 0.0, \"luban_live_gift_amount\": 0, \"qq\": 0, \"download_finish_cost\": 0.0, \"luban_live_pay_order_count\": 0, \"show\": 16110, \"download_start_rate\": 0.0, \"active\": 78, \"shopping\": 0, \"download\": 0, \"active_cost\": 112.8, \"redirect\": 0, \"attribution_wechat_login_30d_cost\": 0.0, \"luban_live_click_product_cnt\": 0, \"ies_challenge_click\": 0, \"valid_play_cost\": 5.54, \"active_register_cost\": 114.27, \"play_duration_sum\": 74262262, \"next_day_open\": 0, \"pre_convert_cost\": 204, \"luban_live_slidecart_click_cnt\": 0, \"in_app_pay\": 0, \"comment\": 4, \"card_show\": 0, \"campaign_id\": null, \"game_addiction\": 0, \"coupon\": 0, \"poi_collect\": 0, \"active_rate\": 28.57, \"deep_convert_cost\": 0.0, \"follow\": 0, \"stat_datetime\": \"2021-09-01 00:00:00\", \"play_100_feed_break\": 602, \"phone_connect\": 0, \"share\": 0, \"luban_live_enter_cnt\": 0, \"attribution_wechat_first_pay_30d_cost\": 0.0, \"attribution_next_day_open_cnt\": 0, \"luban_live_comment_cnt\": 0, \"wechat\": 0, \"approval_count\": 0.0, \"play_25_feed_break\": 1606, \"click_landing_page\": 0, \"click_website\": 0}]}}\n";
        JSONObject data = JSON.parseObject(plan_msg);
        Integer code = data.getInteger("code");
        if (code == 0 && !data.isEmpty()){
            JSONObject dat = data.getJSONObject("data");
            if (dat.containsKey("list")){
                List<Map> list = dat.getJSONArray("list").toJavaList(Map.class);
                for (Map item:list) {
                    println(item);
                }
            }
        }

//        for ( Map.Entry<String, Object> item:data.entrySet()) {
//            System.out.println(item.getKey());
//            System.out.println(item.getValue());
//        }
    }



    public void println(Object item){
        System.out.println(item);
    }
  

    public interface ValueFilter extends SerializeFilter {
        Object process(Object object, String propertyName, Object propertyValue);
    }


    public static void main(String[] args){

        HashMap<String,Object> obj = new HashMap<>();
        obj.put("thisa","onehodd");
        obj.put("show","ruter");
        
         // 定义一个json 序列化之后的数据的格式 
        class Goo {
            @JSONField
            private  String show;

            public void setShow(String show) {
                this.show = show;
            }

            @JSONField
            private  String thisa;

            public void setThisa(String thisa) {
                this.thisa = thisa;
            }

            public String getShow() {
                return show;
            }

            public String getThisa() {
                return thisa;
            }
        }
      
        // 对输出的值进行过滤处理
        ContextValueFilter vf = new ContextValueFilter() {
            @Override
            public Object process(BeanContext context, Object object, String name, Object value) {
                if(name == "show"){
                    return "asadsa";
                }
                return value;
            }
        };

        Goo g = new Goo();
        g.show = "asa";
        g.thisa = "7809";
        
        // json filter
                        SerializeFilter[] serializeFilters = {vf};
                String s = JSON.toJSONString(media, SerializeConfig.getGlobalInstance(),serializeFilters,  SerializerFeature.valueOf("WriteMapNullValue"),SerializerFeature.valueOf("QuoteFieldNames"));
      
      
        // 添加过滤修改编译后的数据名称
        SerializeConfig.getGlobalInstance().addFilter(Goo.class, new NameFilter() {
            @Override
            public String process(Object object, String name, Object value) {
                if (name == "show"){
                    return "wenwen";
                }
                return name;
            }
        });

        String da =  JSON.toJSONString(g, vf);
        System.out.println(da);

    }
  
  
     // json 数据多余参数的处理
     private List<String> ConvertData(List<Map> args, String userId, String startDate,int mediaKey){
        if(args != null && !args.isEmpty()){
            List<String> mediaPlans = new ArrayList<>();
            for (Map item:args) {
                ExtraProcessor processor = new ExtraProcessor() {
                    public void processExtra(Object object, String key, Object value) {
                        MediaPlan vo = (MediaPlan) object;
                        vo.getInfo().put(key, value);
                    }
                };
                MediaPlan media = JSON.parseObject(item.toString(), MediaPlan.class, processor);
                media.setCollect_day(startDate);
                media.setAdvertiser_id(userId);
                media.setMedia_key(mediaKey);
                media.setLevel(DataLevel.MEDIA_PLAN_COLLECT_REPORT);
                String s = JSON.toJSONString(media, SerializerFeature.WRITE_MAP_NULL_FEATURES);
                mediaPlans.add(s);
            }
            String s = JSON.toJSONString(mediaPlans,SerializerFeature.WRITE_MAP_NULL_FEATURES);
            System.out.println(s);
            return mediaPlans;
        }
        return null;
    }
  
  /**
  * 数据转化的数据字典
  * /
 class DataMap {
    
    // 多余的参数的过滤操作🤡
    private Map<String, Object> info = new HashMap<String, Object>();

 
    @JSONField(serialize=true)
    public Map<String, Object> getInfo() { return info;}
    
    // 多个字段值映射到ad_id
    @JSONField(alternateNames = {"adgroup_id","adid","unit_id","adGroupId"})
    private  Long ad_id;
 }
}

