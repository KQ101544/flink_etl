package cn.ktte.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ktte.dw.realtime.beans.AreaBean;

public class AreaUtil {

	private static List<AreaBean> list = new ArrayList<AreaBean>();
	private static Map<Long, AreaBean> areaMaps = new HashMap<Long, AreaBean>();
	
	public static void main(String[] args) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
	
	static {
		//初始化省份
		list.add(new AreaBean(1,"110000","0",1,"北京市","39.929986","116.395645"));
		list.add(new AreaBean(2,"120000","0",1,"天津市","39.14393","117.210813"));
		list.add(new AreaBean(3,"130000","0",1,"河北省","38.61384","115.661434"));
		list.add(new AreaBean(4,"140000","0",1,"山西省","37.866566","112.515496"));
		list.add(new AreaBean(5,"150000","0",1,"内蒙古自治区","43.468238","114.415868"));
		list.add(new AreaBean(6,"210000","0",1,"辽宁省","41.6216","122.753592"));
		list.add(new AreaBean(7,"220000","0",1,"吉林省","43.678846","126.262876"));
		list.add(new AreaBean(8,"230000","0",1,"黑龙江省","47.356592","128.047414"));
		list.add(new AreaBean(9,"310000","0",1,"上海市","31.249162","121.487899"));
		list.add(new AreaBean(10,"320000","0",1,"江苏省","33.013797","119.368489"));
		list.add(new AreaBean(11,"330000","0",1,"浙江省","29.159494","119.957202"));
		list.add(new AreaBean(12,"340000","0",1,"安徽省","31.859252","117.216005"));
		list.add(new AreaBean(13,"350000","0",1,"福建省","26.050118","117.984943"));
		list.add(new AreaBean(14,"360000","0",1,"江西省","27.757258","115.676082"));
		list.add(new AreaBean(15,"370000","0",1,"山东省","36.09929","118.527663"));
		list.add(new AreaBean(16,"410000","0",1,"河南省","34.157184","113.486804"));
		list.add(new AreaBean(17,"420000","0",1,"湖北省","31.209316","112.410562"));
		list.add(new AreaBean(18,"430000","0",1,"湖南省","27.695864","111.720664"));
		list.add(new AreaBean(19,"440000","0",1,"广东省","23.408004","113.394818"));
		list.add(new AreaBean(20,"450000","0",1,"广西壮族自治区","23.552255","108.924274"));
		list.add(new AreaBean(21,"460000","0",1,"海南省","19.180501","109.733755"));
		list.add(new AreaBean(22,"500000","0",1,"重庆市","29.544606","106.530635"));
		list.add(new AreaBean(23,"510000","0",1,"四川省","0.367481","102.89916"));
		list.add(new AreaBean(24,"520000","0",1,"贵州省","26.902826","106.734996"));
		list.add(new AreaBean(25,"530000","0",1,"云南省","24.864213","101.592952"));
		list.add(new AreaBean(26,"540000","0",1,"西藏自治区","1.367315","89.137982"));
		list.add(new AreaBean(27,"610000","0",1,"陕西省","35.860026","109.503789"));
		list.add(new AreaBean(28,"620000","0",1,"甘肃省","38.103267","102.457625"));
		list.add(new AreaBean(29,"630000","0",1,"青海省","5.499761","96.202544"));
		list.add(new AreaBean(30,"640000","0",1,"宁夏回族自治区","37.321323","106.155481"));
		list.add(new AreaBean(31,"650000","0",1,"新疆维吾尔自治区","2.127001","85.614899"));
		list.add(new AreaBean(32,"810000","0",1,"香港特别行政区","22.293586","114.186124"));
		list.add(new AreaBean(33,"820000","0",1,"澳门特别行政区","22.204118","113.557519"));
		
		//初始化市区
//		list.add(new AreaBean(1,"130100","130000",2,"石家庄市","38.048958","114.522082"));
//		list.add(new AreaBean(2,"130200","130000",2,"唐山市","39.650531","118.183451"));
//		list.add(new AreaBean(3,"130300","130000",2,"秦皇岛市","39.945462","119.604368"));
//		list.add(new AreaBean(4,"130400","130000",2,"邯郸市","36.609308","114.482694"));
//		list.add(new AreaBean(5,"130500","130000",2,"邢台市","37.069531","114.520487"));
//		list.add(new AreaBean(6,"130600","130000",2,"保定市","38.886565","115.49481"));
//		list.add(new AreaBean(7,"130700","130000",2,"张家口市","40.811188","114.893782"));
//		list.add(new AreaBean(8,"130800","130000",2,"承德市","40.992521","117.933822"));
//		list.add(new AreaBean(9,"130900","130000",2,"沧州市","38.297615","116.863806"));
//		list.add(new AreaBean(10,"131000","130000",2,"廊坊市","39.518611","116.703602"));
//		list.add(new AreaBean(11,"131100","130000",2,"衡水市","37.746929","115.686229"));
//		list.add(new AreaBean(12,"140100","140000",2,"太原市","37.890277","112.550864"));
//		list.add(new AreaBean(13,"140200","140000",2,"大同市","40.113744","113.290509"));
//		list.add(new AreaBean(14,"140300","140000",2,"阳泉市","37.869529","113.569238"));
//		list.add(new AreaBean(15,"140400","140000",2,"长治市","36.201664","113.120292"));
//		list.add(new AreaBean(16,"140500","140000",2,"晋城市","35.499834","112.867333"));
//		list.add(new AreaBean(17,"140600","140000",2,"朔州市","39.337672","112.479928"));
//		list.add(new AreaBean(18,"140700","140000",2,"晋中市","37.693362","112.738514"));
//		list.add(new AreaBean(19,"140800","140000",2,"运城市","35.038859","111.006854"));
//		list.add(new AreaBean(20,"140900","140000",2,"忻州市","38.461031","112.727939"));
//		list.add(new AreaBean(21,"141000","140000",2,"临汾市","36.099745","111.538788"));
//		list.add(new AreaBean(22,"150100","150000",2,"呼和浩特市","40.828319","111.660351"));
//		list.add(new AreaBean(23,"150200","150000",2,"包头市","40.647119","109.846239"));
//		list.add(new AreaBean(24,"150300","150000",2,"乌海市","39.683177","106.831999"));
//		list.add(new AreaBean(25,"150400","150000",2,"赤峰市","42.297112","118.930761"));
//		list.add(new AreaBean(26,"150500","150000",2,"通辽市","43.633756","122.260363"));
//		list.add(new AreaBean(27,"150600","150000",2,"鄂尔多斯市","39.81649","109.993706"));
//		list.add(new AreaBean(28,"150700","150000",2,"呼伦贝尔市","49.201636","119.760822"));
//		list.add(new AreaBean(29,"152200","150000",2,"兴安盟","46.083757","122.048167"));
//		list.add(new AreaBean(30,"152500","150000",2,"锡林郭勒盟","43.939705","116.02734"));
//		list.add(new AreaBean(31,"152900","150000",2,"阿拉善盟","38.843075","105.695683"));
//		list.add(new AreaBean(32,"210100","210000",2,"沈阳市","41.808645","123.432791"));
//		list.add(new AreaBean(33,"210200","210000",2,"大连市","38.94871","121.593478"));
//		list.add(new AreaBean(34,"210300","210000",2,"鞍山市","41.118744","123.007763"));
//		list.add(new AreaBean(35,"210400","210000",2,"抚顺市","41.877304","123.92982"));
//		list.add(new AreaBean(36,"210500","210000",2,"本溪市","41.325838","123.778062"));
//		list.add(new AreaBean(37,"210600","210000",2,"丹东市","40.129023","124.338543"));
//		list.add(new AreaBean(38,"210700","210000",2,"锦州市","41.130879","121.147749"));
//		list.add(new AreaBean(39,"210800","210000",2,"营口市","40.668651","122.233391"));
//		list.add(new AreaBean(40,"210900","210000",2,"阜新市","42.01925","121.660822"));
//		list.add(new AreaBean(41,"211000","210000",2,"辽阳市","41.273339","123.172451"));
//		list.add(new AreaBean(42,"211100","210000",2,"盘锦市","41.141248","122.073228"));
//		list.add(new AreaBean(43,"211200","210000",2,"铁岭市","42.299757","123.85485"));
//		list.add(new AreaBean(44,"211300","210000",2,"朝阳市","41.571828","120.446163"));
//		list.add(new AreaBean(45,"211400","210000",2,"葫芦岛市","40.74303","120.860758"));
//		list.add(new AreaBean(46,"220100","220000",2,"长春市","43.898338","125.313642"));
//		list.add(new AreaBean(47,"220200","220000",2,"吉林市","43.678846","126.262876"));
//		list.add(new AreaBean(48,"220300","220000",2,"四平市","43.175525","124.391382"));
//		list.add(new AreaBean(49,"220400","220000",2,"辽源市","42.923303","125.133686"));
//		list.add(new AreaBean(50,"220500","220000",2,"通化市","41.736397","125.94265"));
//		list.add(new AreaBean(51,"220600","220000",2,"白山市","41.945859","126.435798"));
//		list.add(new AreaBean(52,"220700","220000",2,"松原市","45.136049","124.832995"));
//		list.add(new AreaBean(53,"220800","220000",2,"白城市","45.621086","122.840777"));
//		list.add(new AreaBean(54,"222400","220000",2,"延边朝鲜族自治州","42.896414","129.485902"));
//		list.add(new AreaBean(55,"230100","230000",2,"哈尔滨市","45.773225","126.657717"));
//		list.add(new AreaBean(56,"230200","230000",2,"齐齐哈尔市","47.3477","123.987289"));
//		list.add(new AreaBean(57,"230300","230000",2,"鸡西市","45.32154","130.941767"));
//		list.add(new AreaBean(58,"230400","230000",2,"鹤岗市","47.338666","130.292472"));
//		list.add(new AreaBean(59,"230500","230000",2,"双鸭山市","46.655102","131.171402"));
//		list.add(new AreaBean(60,"230600","230000",2,"大庆市","46.596709","125.02184"));
//		list.add(new AreaBean(61,"230700","230000",2,"伊春市","47.734685","128.910766"));
//		list.add(new AreaBean(62,"230800","230000",2,"佳木斯市","46.81378","130.284735"));
//		list.add(new AreaBean(63,"230900","230000",2,"七台河市","45.775005","131.019048"));
//		list.add(new AreaBean(64,"231000","230000",2,"牡丹江市","44.588521","129.608035"));
//		list.add(new AreaBean(65,"231100","230000",2,"黑河市","50.25069","127.50083"));
//		list.add(new AreaBean(66,"231200","230000",2,"绥化市","46.646064","126.989095"));
//		list.add(new AreaBean(67,"232700","230000",2,"大兴安岭地区","51.991789","124.196104"));
//		list.add(new AreaBean(68,"320100","320000",2,"南京市","32.057236","118.778074"));
//		list.add(new AreaBean(69,"320200","320000",2,"无锡市","31.570037","120.305456"));
//		list.add(new AreaBean(70,"320300","320000",2,"徐州市","34.271553","117.188107"));
//		list.add(new AreaBean(71,"320400","320000",2,"常州市","31.771397","119.981861"));
//		list.add(new AreaBean(72,"320500","320000",2,"苏州市","31.317987","120.619907"));
//		list.add(new AreaBean(73,"320600","320000",2,"南通市","32.014665","120.873801"));
//		list.add(new AreaBean(74,"320700","320000",2,"连云港市","34.601549","119.173872"));
//		list.add(new AreaBean(75,"320800","320000",2,"淮安市","33.606513","119.030186"));
//		list.add(new AreaBean(76,"320900","320000",2,"盐城市","33.379862","120.148872"));
//		list.add(new AreaBean(77,"321000","320000",2,"扬州市","32.408505","119.427778"));
//		list.add(new AreaBean(78,"321100","320000",2,"镇江市","32.204409","119.455835"));
//		list.add(new AreaBean(79,"321200","320000",2,"泰州市","32.476053","119.919606"));
//		list.add(new AreaBean(80,"321300","320000",2,"宿迁市","33.95205","118.296893"));
//		list.add(new AreaBean(81,"330100","330000",2,"杭州市","30.259244","120.219375"));
//		list.add(new AreaBean(82,"330200","330000",2,"宁波市","29.885259","121.579006"));
//		list.add(new AreaBean(83,"330300","330000",2,"温州市","28.002838","120.690635"));
//		list.add(new AreaBean(84,"330400","330000",2,"嘉兴市","30.773992","120.760428"));
//		list.add(new AreaBean(85,"330500","330000",2,"湖州市","30.877925","120.137243"));
//		list.add(new AreaBean(86,"330600","330000",2,"绍兴市","30.002365","120.592467"));
//		list.add(new AreaBean(87,"330700","330000",2,"金华市","29.102899","119.652576"));
//		list.add(new AreaBean(88,"330800","330000",2,"衢州市","28.95691","118.875842"));
//		list.add(new AreaBean(89,"330900","330000",2,"舟山市","30.03601","122.169872"));
//		list.add(new AreaBean(90,"331000","330000",2,"台州市","28.668283","121.440613"));
//		list.add(new AreaBean(91,"331100","330000",2,"丽水市","28.4563","119.929576"));
//		list.add(new AreaBean(92,"340100","340000",2,"合肥市","31.866942","117.282699"));
//		list.add(new AreaBean(93,"340200","340000",2,"芜湖市","31.36602","118.384108"));
//		list.add(new AreaBean(94,"340300","340000",2,"蚌埠市","32.929499","117.35708"));
//		list.add(new AreaBean(95,"340400","340000",2,"淮南市","32.642812","117.018639"));
//		list.add(new AreaBean(96,"340500","340000",2,"马鞍山市","31.688528","118.515882"));
//		list.add(new AreaBean(97,"340600","340000",2,"淮北市","33.960023","116.791447"));
//		list.add(new AreaBean(98,"340700","340000",2,"铜陵市","30.94093","117.819429"));
//		list.add(new AreaBean(99,"340800","340000",2,"安庆市","30.537898","117.058739"));
//		list.add(new AreaBean(100,"341000","340000",2,"黄山市","29.734435","118.29357"));
//		list.add(new AreaBean(101,"341100","340000",2,"滁州市","32.317351","118.32457"));
//		list.add(new AreaBean(102,"341200","340000",2,"阜阳市","32.901211","115.820932"));
//		list.add(new AreaBean(103,"341300","340000",2,"宿州市","33.636772","116.988692"));
//		list.add(new AreaBean(104,"341500","340000",2,"六安市","31.755558","116.505253"));
//		list.add(new AreaBean(105,"341600","340000",2,"亳州市","33.871211","115.787928"));
//		list.add(new AreaBean(106,"341700","340000",2,"池州市","30.660019","117.494477"));
//		list.add(new AreaBean(107,"341800","340000",2,"宣城市","30.951642","118.752096"));
//		list.add(new AreaBean(108,"350100","350000",2,"福州市","26.047125","119.330221"));
//		list.add(new AreaBean(109,"350200","350000",2,"厦门市","24.489231","118.103886"));
//		list.add(new AreaBean(110,"350300","350000",2,"莆田市","25.44845","119.077731"));
//		list.add(new AreaBean(111,"350400","350000",2,"三明市","26.270835","117.642194"));
//		list.add(new AreaBean(112,"350500","350000",2,"泉州市","24.901652","118.600362"));
//		list.add(new AreaBean(113,"350600","350000",2,"漳州市","24.517065","117.676205"));
//		list.add(new AreaBean(114,"350700","350000",2,"南平市","26.643626","118.181883"));
//		list.add(new AreaBean(115,"350800","350000",2,"龙岩市","25.078685","117.017997"));
//		list.add(new AreaBean(116,"350900","350000",2,"宁德市","26.656527","119.542082"));
//		list.add(new AreaBean(117,"360100","360000",2,"南昌市","28.689578","115.893528"));
//		list.add(new AreaBean(118,"360200","360000",2,"景德镇市","29.303563","117.186523"));
//		list.add(new AreaBean(119,"360300","360000",2,"萍乡市","27.639544","113.859917"));
//		list.add(new AreaBean(120,"360400","360000",2,"九江市","29.71964","115.999848"));
//		list.add(new AreaBean(121,"360500","360000",2,"新余市","27.822322","114.947117"));
//		list.add(new AreaBean(122,"360600","360000",2,"鹰潭市","28.24131","117.03545"));
//		list.add(new AreaBean(123,"360700","360000",2,"赣州市","25.845296","114.935909"));
//		list.add(new AreaBean(124,"360800","360000",2,"吉安市","27.113848","114.992039"));
//		list.add(new AreaBean(125,"360900","360000",2,"宜春市","27.81113","114.400039"));
//		list.add(new AreaBean(126,"361000","360000",2,"抚州市","27.954545","116.360919"));
//		list.add(new AreaBean(127,"361100","360000",2,"上饶市","28.457623","117.955464"));
//		list.add(new AreaBean(128,"370100","370000",2,"济南市","36.682785","117.024967"));
//		list.add(new AreaBean(129,"370200","370000",2,"青岛市","36.105215","120.384428"));
//		list.add(new AreaBean(130,"370300","370000",2,"淄博市","36.804685","118.059134"));
//		list.add(new AreaBean(131,"370400","370000",2,"枣庄市","34.807883","117.279305"));
//		list.add(new AreaBean(132,"370500","370000",2,"东营市","37.487121","118.583926"));
//		list.add(new AreaBean(133,"370600","370000",2,"烟台市","37.536562","121.309555"));
//		list.add(new AreaBean(134,"370700","370000",2,"潍坊市","36.716115","119.142634"));
//		list.add(new AreaBean(135,"370800","370000",2,"济宁市","35.402122","116.600798"));
//		list.add(new AreaBean(136,"370900","370000",2,"泰安市","36.188078","117.089415"));
//		list.add(new AreaBean(137,"371000","370000",2,"威海市","37.528787","122.093958"));
//		list.add(new AreaBean(138,"371100","370000",2,"日照市","35.420225","119.50718"));
//		list.add(new AreaBean(139,"371200","370000",2,"莱芜市","36.233654","117.684667"));
//		list.add(new AreaBean(140,"371300","370000",2,"临沂市","35.072409","118.340768"));
//		list.add(new AreaBean(141,"371400","370000",2,"德州市","37.460826","116.328161"));
//		list.add(new AreaBean(142,"371500","370000",2,"聊城市","36.455829","115.986869"));
//		list.add(new AreaBean(143,"371600","370000",2,"滨州市","37.405314","117.968292"));
//		list.add(new AreaBean(144,"410100","410000",2,"郑州市","34.75661","113.649644"));
//		list.add(new AreaBean(145,"410200","410000",2,"开封市","34.801854","114.351642"));
//		list.add(new AreaBean(146,"410300","410000",2,"洛阳市","34.657368","112.447525"));
//		list.add(new AreaBean(147,"410400","410000",2,"平顶山市","33.745301","113.300849"));
//		list.add(new AreaBean(148,"410500","410000",2,"安阳市","36.110267","114.351807"));
//		list.add(new AreaBean(149,"410600","410000",2,"鹤壁市","35.755426","114.29777"));
//		list.add(new AreaBean(150,"410700","410000",2,"新乡市","35.307258","113.91269"));
//		list.add(new AreaBean(151,"410800","410000",2,"焦作市","35.234608","113.211836"));
//		list.add(new AreaBean(152,"410900","410000",2,"濮阳市","35.753298","115.026627"));
//		list.add(new AreaBean(153,"411000","410000",2,"许昌市","34.02674","113.835312"));
//		list.add(new AreaBean(154,"411100","410000",2,"漯河市","33.576279","114.046061"));
//		list.add(new AreaBean(155,"411200","410000",2,"三门峡市","34.78332","111.181262"));
//		list.add(new AreaBean(156,"411300","410000",2,"南阳市","33.01142","112.542842"));
//		list.add(new AreaBean(157,"411400","410000",2,"商丘市","34.438589","115.641886"));
//		list.add(new AreaBean(158,"411500","410000",2,"信阳市","32.128582","114.085491"));
//		list.add(new AreaBean(159,"411600","410000",2,"周口市","33.623741","114.654102"));
//		list.add(new AreaBean(160,"411700","410000",2,"驻马店市","32.983158","114.049154"));
//		list.add(new AreaBean(161,"420100","420000",2,"武汉市","30.581084","114.3162"));
//		list.add(new AreaBean(162,"420200","420000",2,"黄石市","30.216127","115.050683"));
//		list.add(new AreaBean(163,"420300","420000",2,"十堰市","32.636994","110.801229"));
//		list.add(new AreaBean(164,"420500","420000",2,"宜昌市","30.732758","111.310981"));
//		list.add(new AreaBean(165,"420600","420000",2,"襄阳市","32.229169","112.250093"));
//		list.add(new AreaBean(166,"420700","420000",2,"鄂州市","30.384439","114.895594"));
//		list.add(new AreaBean(167,"420800","420000",2,"荆门市","31.042611","112.21733"));
//		list.add(new AreaBean(168,"420900","420000",2,"孝感市","30.927955","113.935734"));
//		list.add(new AreaBean(169,"421000","420000",2,"荆州市","30.332591","112.241866"));
//		list.add(new AreaBean(170,"421100","420000",2,"黄冈市","30.446109","114.906618"));
//		list.add(new AreaBean(171,"421200","420000",2,"咸宁市","29.880657","114.300061"));
//		list.add(new AreaBean(172,"421300","420000",2,"随州市","31.717858","113.379358"));
//		list.add(new AreaBean(173,"422800","420000",2,"恩施土家族苗族自治州","30.308978","109.517433"));
//		list.add(new AreaBean(174,"430100","430000",2,"长沙市","28.213478","112.979353"));
//		list.add(new AreaBean(175,"430200","430000",2,"株洲市","27.827433","113.131695"));
//		list.add(new AreaBean(176,"430300","430000",2,"湘潭市","27.835095","112.935556"));
//		list.add(new AreaBean(177,"430400","430000",2,"衡阳市","26.898164","112.583819"));
//		list.add(new AreaBean(178,"430500","430000",2,"邵阳市","27.236811","111.461525"));
//		list.add(new AreaBean(179,"430600","430000",2,"岳阳市","29.378007","113.146196"));
//		list.add(new AreaBean(180,"430700","430000",2,"常德市","29.012149","111.653718"));
//		list.add(new AreaBean(181,"430800","430000",2,"张家界市","29.124889","110.48162"));
//		list.add(new AreaBean(182,"430900","430000",2,"益阳市","28.588088","112.366547"));
//		list.add(new AreaBean(183,"431000","430000",2,"郴州市","25.782264","113.037704"));
//		list.add(new AreaBean(184,"431100","430000",2,"永州市","26.435972","111.614648"));
//		list.add(new AreaBean(185,"431200","430000",2,"怀化市","27.557483","109.986959"));
//		list.add(new AreaBean(186,"431300","430000",2,"娄底市","27.741073","111.996396"));
//		list.add(new AreaBean(187,"433100","430000",2,"湘西土家族苗族自治州","28.317951","109.745746"));
//		list.add(new AreaBean(188,"440100","440000",2,"广州市","23.120049","113.30765"));
//		list.add(new AreaBean(189,"440200","440000",2,"韶关市","24.80296","113.594461"));
//		list.add(new AreaBean(190,"440300","440000",2,"深圳市","22.546054","114.025974"));
//		list.add(new AreaBean(191,"440400","440000",2,"珠海市","22.256915","113.562447"));
//		list.add(new AreaBean(192,"440500","440000",2,"汕头市","23.383908","116.72865"));
//		list.add(new AreaBean(193,"440600","440000",2,"佛山市","23.035095","113.134026"));
//		list.add(new AreaBean(194,"440700","440000",2,"江门市","22.575117","113.078125"));
//		list.add(new AreaBean(195,"440800","440000",2,"湛江市","21.257463","110.365067"));
//		list.add(new AreaBean(196,"440900","440000",2,"茂名市","21.668226","110.931245"));
//		list.add(new AreaBean(197,"441200","440000",2,"肇庆市","23.078663","112.479653"));
//		list.add(new AreaBean(198,"441300","440000",2,"惠州市","23.11354","114.410658"));
//		list.add(new AreaBean(199,"441400","440000",2,"梅州市","24.304571","116.126403"));
//		list.add(new AreaBean(200,"441500","440000",2,"汕尾市","22.778731","115.372924"));
//		list.add(new AreaBean(201,"441600","440000",2,"河源市","23.757251","114.713721"));
//		list.add(new AreaBean(202,"441700","440000",2,"阳江市","21.871517","111.97701"));
//		list.add(new AreaBean(203,"441800","440000",2,"清远市","23.698469","113.040773"));
//		list.add(new AreaBean(204,"441900","440000",2,"东莞市","23.043024","113.763434"));
//		list.add(new AreaBean(205,"442000","440000",2,"中山市","22.545178","113.42206"));
//		list.add(new AreaBean(206,"445100","440000",2,"潮州市","23.661812","116.630076"));
//		list.add(new AreaBean(207,"445200","440000",2,"揭阳市","23.547999","116.379501"));
//		list.add(new AreaBean(208,"445300","440000",2,"云浮市","22.937976","112.050946"));
//		list.add(new AreaBean(209,"450100","450000",2,"南宁市","22.806493","108.297234"));
//		list.add(new AreaBean(210,"450200","450000",2,"柳州市","24.329053","109.422402"));
//		list.add(new AreaBean(211,"450300","450000",2,"桂林市","25.262901","110.26092"));
//		list.add(new AreaBean(212,"450400","450000",2,"梧州市","23.485395","111.305472"));
//		list.add(new AreaBean(213,"450500","450000",2,"北海市","21.472718","109.122628"));
//		list.add(new AreaBean(214,"450600","450000",2,"防城港市","21.617398","108.351791"));
//		list.add(new AreaBean(215,"450700","450000",2,"钦州市","21.97335","108.638798"));
//		list.add(new AreaBean(216,"450800","450000",2,"贵港市","23.103373","109.613708"));
//		list.add(new AreaBean(217,"450900","450000",2,"玉林市","22.643974","110.151676"));
//		list.add(new AreaBean(218,"451000","450000",2,"百色市","23.901512","106.631821"));
//		list.add(new AreaBean(219,"451100","450000",2,"贺州市","24.411054","111.552594"));
//		list.add(new AreaBean(220,"451200","450000",2,"河池市","24.699521","108.069948"));
//		list.add(new AreaBean(221,"451300","450000",2,"来宾市","23.741166","109.231817"));
//		list.add(new AreaBean(222,"451400","450000",2,"崇左市","22.415455","107.357322"));
//		list.add(new AreaBean(223,"460100","460000",2,"海口市","20.022071","110.330802"));
//		list.add(new AreaBean(224,"460200","460000",2,"三亚市","18.257776","109.522771"));
//		list.add(new AreaBean(225,"510100","510000",2,"成都市","30.679943","104.067923"));
//		list.add(new AreaBean(226,"510300","510000",2,"自贡市","29.359157","104.776071"));
//		list.add(new AreaBean(227,"510400","510000",2,"攀枝花市","26.587571","101.722423"));
//		list.add(new AreaBean(228,"510500","510000",2,"泸州市","28.89593","105.44397"));
//		list.add(new AreaBean(229,"510600","510000",2,"德阳市","31.13114","104.402398"));
//		list.add(new AreaBean(230,"510700","510000",2,"绵阳市","31.504701","104.705519"));
//		list.add(new AreaBean(231,"510800","510000",2,"广元市","32.44104","105.819687"));
//		list.add(new AreaBean(232,"510900","510000",2,"遂宁市","30.557491","105.564888"));
//		list.add(new AreaBean(233,"511000","510000",2,"内江市","29.599462","105.073056"));
//		list.add(new AreaBean(234,"511100","510000",2,"乐山市","29.600958","103.760824"));
//		list.add(new AreaBean(235,"511300","510000",2,"南充市","30.800965","106.105554"));
//		list.add(new AreaBean(236,"511400","510000",2,"眉山市","30.061115","103.84143"));
//		list.add(new AreaBean(237,"511500","510000",2,"宜宾市","28.769675","104.633019"));
//		list.add(new AreaBean(238,"511600","510000",2,"广安市","30.463984","106.63572"));
//		list.add(new AreaBean(239,"511700","510000",2,"达州市","31.214199","107.494973"));
//		list.add(new AreaBean(240,"511800","510000",2,"雅安市","29.999716","103.009356"));
//		list.add(new AreaBean(241,"511900","510000",2,"巴中市","31.869189","106.757916"));
//		list.add(new AreaBean(242,"512000","510000",2,"资阳市","30.132191","104.63593"));
//		list.add(new AreaBean(243,"513200","510000",2,"阿坝藏族羌族自治州","31.905763","102.228565"));
//		list.add(new AreaBean(244,"513300","510000",2,"甘孜藏族自治州","30.055144","101.969232"));
//		list.add(new AreaBean(245,"513400","510000",2,"凉山彝族自治州","27.892393","102.259591"));
//		list.add(new AreaBean(246,"520100","520000",2,"贵阳市","26.629907","106.709177"));
//		list.add(new AreaBean(247,"520200","520000",2,"六盘水市","26.591866","104.852087"));
//		list.add(new AreaBean(248,"520300","520000",2,"遵义市","27.699961","106.93126"));
//		list.add(new AreaBean(249,"520400","520000",2,"安顺市","26.228595","105.92827"));
//		list.add(new AreaBean(250,"520500","520000",2,"毕节市","27.408562","105.333323"));
//		list.add(new AreaBean(251,"520600","520000",2,"铜仁市","27.674903","109.168558"));
//		list.add(new AreaBean(252,"522600","520000",2,"黔东南苗族侗族自治州","26.583992","107.985353"));
//		list.add(new AreaBean(253,"522700","520000",2,"黔南布依族苗族自治州","26.264536","107.523205"));
//		list.add(new AreaBean(254,"530100","530000",2,"昆明市","25.049153","102.714601"));
//		list.add(new AreaBean(255,"530300","530000",2,"曲靖市","25.520758","103.782539"));
//		list.add(new AreaBean(256,"530400","530000",2,"玉溪市","24.370447","102.545068"));
//		list.add(new AreaBean(257,"530500","530000",2,"保山市","25.120489","99.177996"));
//		list.add(new AreaBean(258,"530600","530000",2,"昭通市","27.340633","103.725021"));
//		list.add(new AreaBean(259,"530700","530000",2,"丽江市","26.875351","100.229628"));
//		list.add(new AreaBean(260,"530800","530000",2,"普洱市","22.788778","100.980058"));
//		list.add(new AreaBean(261,"532300","530000",2,"楚雄彝族自治州","25.066356","101.529382"));
//		list.add(new AreaBean(262,"532500","530000",2,"红河哈尼族彝族自治州","23.367718","103.384065"));
//		list.add(new AreaBean(263,"532600","530000",2,"文山壮族苗族自治州","23.401781","104.089112"));
//		list.add(new AreaBean(264,"532800","530000",2,"西双版纳傣族自治州","22.009433","100.803038"));
//		list.add(new AreaBean(265,"532900","530000",2,"大理白族自治州","25.5969","100.223675"));
//		list.add(new AreaBean(266,"533100","530000",2,"德宏傣族景颇族自治州","4.44124","98.589434"));
//		list.add(new AreaBean(267,"533300","530000",2,"怒江傈僳族自治州","5.860677","98.859932"));
//		list.add(new AreaBean(268,"533400","530000",2,"迪庆藏族自治州","7.831029","99.713682"));
//		list.add(new AreaBean(269,"540100","540000",2,"拉萨市","29.662557","91.111891"));
//		list.add(new AreaBean(270,"542100","540000",2,"昌都地区","31.140576","97.185582"));
//		list.add(new AreaBean(271,"542200","540000",2,"山南地区","29.229027","91.750644"));
//		list.add(new AreaBean(272,"542300","540000",2,"日喀则地区","29.269023","88.891486"));
//		list.add(new AreaBean(273,"542400","540000",2,"那曲地区","31.48068","92.067018"));
//		list.add(new AreaBean(274,"542500","540000",2,"阿里地区","30.404557","81.107669"));
//		list.add(new AreaBean(275,"542600","540000",2,"林芝地区","29.666941","94.349985"));
//		list.add(new AreaBean(276,"610100","610000",2,"西安市","34.2778","108.953098"));
//		list.add(new AreaBean(277,"610200","610000",2,"铜川市","34.908368","108.968067"));
//		list.add(new AreaBean(278,"610300","610000",2,"宝鸡市","34.364081","107.170645"));
//		list.add(new AreaBean(279,"610400","610000",2,"咸阳市","34.345373","108.707509"));
//		list.add(new AreaBean(280,"610500","610000",2,"渭南市","34.502358","109.483933"));
//		list.add(new AreaBean(281,"610600","610000",2,"延安市","36.60332","109.50051"));
//		list.add(new AreaBean(282,"610700","610000",2,"汉中市","33.081569","107.045478"));
//		list.add(new AreaBean(283,"610800","610000",2,"榆林市","38.279439","109.745926"));
//		list.add(new AreaBean(284,"610900","610000",2,"安康市","32.70437","109.038045"));
//		list.add(new AreaBean(285,"611000","610000",2,"商洛市","33.873907","109.934208"));
//		list.add(new AreaBean(286,"620100","620000",2,"兰州市","36.064226","103.823305"));
//		list.add(new AreaBean(287,"620200","620000",2,"嘉峪关市","39.802397","98.281635"));
//		list.add(new AreaBean(288,"620300","620000",2,"金昌市","38.516072","102.208126"));
//		list.add(new AreaBean(289,"620400","620000",2,"白银市","36.546682","104.171241"));
//		list.add(new AreaBean(290,"620500","620000",2,"天水市","34.584319","105.736932"));
//		list.add(new AreaBean(291,"620600","620000",2,"武威市","37.933172","102.640147"));
//		list.add(new AreaBean(292,"620700","620000",2,"张掖市","38.93932","100.459892"));
//		list.add(new AreaBean(293,"620800","620000",2,"平凉市","35.55011","106.688911"));
//		list.add(new AreaBean(294,"620900","620000",2,"酒泉市","39.741474","98.508415"));
//		list.add(new AreaBean(295,"621000","620000",2,"庆阳市","35.726801","107.644227"));
//		list.add(new AreaBean(296,"622900","620000",2,"临夏回族自治州","35.598514","103.215249"));
//		list.add(new AreaBean(297,"623000","620000",2,"甘南藏族自治州","34.992211","102.917442"));
//		list.add(new AreaBean(298,"630100","630000",2,"西宁市","36.640739","101.767921"));
//		list.add(new AreaBean(299,"632200","630000",2,"海北藏族自治州","36.960654","100.879802"));
//		list.add(new AreaBean(300,"632300","630000",2,"黄南藏族自治州",".522852","102.0076"));
//		list.add(new AreaBean(301,"632500","630000",2,"海南藏族自治州","19.180501","109.733755"));
//		list.add(new AreaBean(302,"632600","630000",2,"果洛藏族自治州","34.480485","100.223723"));
//		list.add(new AreaBean(303,"632700","630000",2,"玉树藏族自治州","3.00624","97.013316"));
//		list.add(new AreaBean(304,"632800","630000",2,"海西蒙古族藏族自治州","7.373799","97.342625"));
//		list.add(new AreaBean(305,"640100","640000",2,"银川市","38.502621","106.206479"));
//		list.add(new AreaBean(306,"640200","640000",2,"石嘴山市","39.020223","106.379337"));
//		list.add(new AreaBean(307,"640300","640000",2,"吴忠市","37.993561","106.208254"));
//		list.add(new AreaBean(308,"640400","640000",2,"固原市","36.021523","106.285268"));
//		list.add(new AreaBean(309,"650100","650000",2,"乌鲁木齐市","43.84038","87.564988"));
//		list.add(new AreaBean(310,"650200","650000",2,"克拉玛依市","45.594331","84.88118"));
//		list.add(new AreaBean(311,"652100","650000",2,"吐鲁番地区","42.96047","89.181595"));
//		list.add(new AreaBean(312,"652200","650000",2,"哈密地区","42.858596","93.528355"));
//		list.add(new AreaBean(313,"652300","650000",2,"昌吉回族自治州","4.007058","87.296038"));
//		list.add(new AreaBean(314,"652700","650000",2,"博尔塔拉蒙古自治州","4.913651","82.052436"));
//		list.add(new AreaBean(315,"652800","650000",2,"巴音郭楞蒙古自治州","41.771362","86.121688"));
//		list.add(new AreaBean(316,"652900","650000",2,"阿克苏地区","41.171731","80.269846"));
//		list.add(new AreaBean(317,"653100","650000",2,"喀什地区","39.470627","75.992973"));
//		list.add(new AreaBean(318,"653200","650000",2,"和田地区","37.116774","79.930239"));
//		list.add(new AreaBean(319,"654000","650000",2,"伊犁哈萨克自治州","3.922248","81.297854"));
//		list.add(new AreaBean(320,"654200","650000",2,"塔城地区","46.758684","82.974881"));
//		list.add(new AreaBean(321,"654300","650000",2,"阿勒泰地区","47.839744","88.137915"));

		
		//初始化市区的
		list.forEach(bean -> {
			areaMaps.put(bean.getId(), bean);
		});
	}

	public static Map<Long, AreaBean> getAreaMaps() {
		return areaMaps;
	}
	
}
