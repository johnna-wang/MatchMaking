<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>首页</title>
<!-- For-Mobile-Apps-and-Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Matchmaking Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, SmartPhone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!-- //For-Mobile-Apps-and-Meta-Tags -->
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link rel='stylesheet' id='fluid_dg-css' href='css/fluid_dg.css'
	type='text/css' media='all'>
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- //Custom Theme files -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- //font-awesome icons -->
<!-- js -->
<script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>
<!-- //js -->
<!-- web-fonts -->
<link href='http://fonts.googleapis.com/css?family=Courgette'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<!-- //web-fonts -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
</head>
<body class="bg">
	<!-- menu -->
	<button class="btn-nav 小贝壳网站模板_btn">
		<span class="bar arrow-top-r"></span> <span class="bar arrow-middle-r"></span>
		<span class="bar arrow-bottom-r"></span>
	</button>
	<nav class="nav-container hidden hideNav w3_nav">
		<ul class="nav-list">
			<li class="list-item active"><a href="IndexServlet"><i
					class="glyphicon glyphicon-home" aria-hidden="true"></i></a></li>
			<li class="list-item"><a href="about.jsp"><i
					class="glyphicon glyphicon-info-sign" aria-hidden="true"></i></a></li>
			<li class="list-item"><a href="services.jsp"><i
					class="glyphicon glyphicon-cog" aria-hidden="true"></i></a></li>
			
			
			<li class="list-item"><a href="contact.jsp"><i
					class="glyphicon glyphicon-envelope" aria-hidden="true"></i></a></li>
		</ul>
	</nav>
	<div id="ban" class="agileinfo_menu w3l_menu">
		<div class="agileinfo_menu_left">
			<h1>
				<a href="main.jsp">Matchmaking<span>For Happy <i>Marriages</i></span></a>
			</h1>
		</div>
		
		
		<c:if test="${message == null && message1==null}">
			<c:if test="${USER != null }">
				<!-- 首次登陆且登录成功 -->
		<div class="agileinfo_menu_right">
			<ul>
				<li><a href="#small-dialog"
					class="play-icon popup-with-zoom-anim">欢迎，${USER.name } </a></li>	
		 </ul>
		</div>		
			</c:if>
				<c:if test="${USER == null }">
				<!-- 没有登录时 -->
		<div class="agileinfo_menu_right">
			<ul>
				<li><a href="#small-dialog"
					class="play-icon popup-with-zoom-anim">登录</a></li>
				<li><a href="#small-dialog1"
					class="play-icon popup-with-zoom-anim">注册</a></li>
			</ul>
			<div class="agileinfo_menu_right_pos">
				<p>或</p>
			</div>    
		</div>
				</c:if>
		</c:if>
					
				<!-- 登录失败时 -->	
		<c:if  test="${message != null }">
		<div class="agileinfo_menu_right">
			<ul>
				<li><a href="#small-dialog"
					class="play-icon popup-with-zoom-anim">登录失败点击再次登录</a></li>
				
			</ul>
		</div>
		</c:if>
		
		<c:if  test="${message1 != null }">
		<div class="agileinfo_menu_right">
			<ul>
				<li><a href="#small-dialog"
					class="play-icon popup-with-zoom-anim">${message1 }</a></li>
				
			</ul>
		</div>
		</c:if>
					
		
		
		<div class="clearfix"></div>
	</div>
	<!-- //menu -->
	<!-- pop-up-box -->
	<div id="small-dialog" class="mfp-hide w3ls_small_dialog">
		<h2>登录</h2>
		<div class="modal-body agileits_modal_body">
			<form action="LoginServlet" method="post">
				<span> <i class="glyphicon glyphicon-envelope"
					aria-hidden="true"></i> <input type="email" name="Email"
					placeholder="邮箱" required="" />
				</span> <span class="w3_modal"> <i class="glyphicon glyphicon-lock"
					aria-hidden="true"></i> <input type="text" name="Password"
					placeholder="密码" required="" />
				</span>
				<div class="agile_remember">
					<div class="agile_remember_left">
						<div class="check">
							<label class="checkbox"><input type="checkbox"
								name="checkbox"><i> </i>记住我</label>
						</div>
					</div>
					<div class="agile_remember_right">
						<a href="#small-dialog2">忘记密码?</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<input type="submit" value="登录">
			</form>
			<h4>继续</h4>
			<div class="social_icons agileinfo_social_asd">
				<!-- Facebook -->
				<a href="#" class="slide-social wthree_slide_social">
					<div class="button">5 Likes</div>
					<div class="facebook icon">
						<i class="fa fa-facebook" aria-hidden="true"></i>
					</div>
					<div class="facebook slide">
						<p>Facebook</p>
					</div>
				</a>
				<!-- Twitter -->
				<a href="#" class="slide-social wthree_slide_social">
					<div class="button">8 Tweets</div>
					<div class="twitter icon">
						<i class="fa fa-twitter" aria-hidden="true"></i>
					</div>
					<div class="twitter slide">
						<p>Twitter</p>
					</div>
				</a>
			</div>
			<h5>
				没有账号? <a href="#small-dialog1"
					class="play-icon popup-with-zoom-anim">注册</a>
			</h5>
		</div>
	</div>
	<div id="small-dialog1" class="mfp-hide">
		<h2>注册</h2>
		<div class="modal-body w3_agileits_modal_body">
			<form action="RegisterServlet" method="post">
				<div class="w3_modal_body_grid">
					<span>为谁注册</span> <select id="w3_country"
						onchange="change_country(this.value)" class="frm-field required">
						<option value="null">选择</option>
						<option value="null">自己</option>
						<option value="null">儿子</option>
						<option value="null">女儿</option>
						<option value="null">兄弟</option>
						<option value="null">姐妹</option>
						<option value="null">亲戚</option>
						<option value="null">朋友</option>
					</select>
				</div>
				<div class="w3_modal_body_grid w3_modal_body_grid1">
					<span>姓名</span> <input type="text" name="Name" placeholder=" "
						required="" />
				</div>
				<div class="w3_modal_body_grid">
					<span>性别</span>
					<div class="w3_gender">
						<div class="colr ert">
							<label class="radio"><input type="radio" name="Sex"
								 value="男" checked="checked"><i></i>男</label>
						</div>
						<div class="colr">
							<label class="radio"><input type="radio" name="Sex"  value="女" ><i></i>女</label>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="w3_modal_body_grid w3_modal_body_grid1">
								
					<span>出生日期</span> <input class="date" id="datepicker" name="Date"
						type="text" value="月/日/年" " onfocus="this.value = '1992-09-09';"
						onblur = "if (this.value == '') {this.value = '1992-08-02';}"
					 required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}">
				</div>
				<div class="w3_modal_body_grid">
					<span>宗教信仰</span> <select id="w3_country1"
						onchange="change_country(this.value)" class="frm-field required" name="Religion">
						<option value="印度教">印度教</option>
						<option value="伊斯兰教">伊斯兰教</option>
						<option value="基督教">基督教</option>
						<option value="锡克教">锡克教</option>
						<option value="耆那教">耆那教</option>
						<option value="佛教">佛教</option>
						<option value="无宗教信仰">没有宗教信仰</option>
					</select>
				</div>
				<div class="w3_modal_body_grid w3_modal_body_grid1">
					<span>国家</span> <input type="text" name="Country" placeholder=" "
						required="" />
				</div>
				<div class="w3_modal_body_grid">
					<span>邮箱</span> <input type="email" name="Email" placeholder=" "
						required="" />
				</div>
				<div class="w3_modal_body_grid w3_modal_body_grid1">
					<span>密码</span> <input type="password" name="Password"
						placeholder=" " required="" />
				</div>
				<input type="submit" value="注册">
			</form>
			<!-- Calendar -->
			<link rel="stylesheet" href="css/jquery-ui.css" />
			<script src="js/jquery-ui.js"></script>
			<script>
				$(function() {
					$("#datepicker").datepicker();
				});
			</script>
			<!-- //Calendar -->
			<h4>继续</h4>
			<div class="social_icons agileits_小贝壳网站模板_cons">
				<!-- Facebook -->
				<a href="#" class="slide-social">
					<div class="button">5 Likes</div>
					<div class="facebook icon agile_facebook">
						<i class="fa fa-facebook" aria-hidden="true"></i>
					</div>
					<div class="facebook slide">
						<p>Facebook</p>
					</div>
				</a>
				<!-- Twitter -->
				<a href="#" class="slide-social">
					<div class="button">8 Tweets</div>
					<div class="twitter icon w3_agile_twitter">
						<i class="fa fa-twitter" aria-hidden="true"></i>
					</div>
					<div class="twitter slide">
						<p>Twitter</p>
					</div>
				</a>
			</div>
			<h5>
				已有帐户 <a href="#small-dialog" class="play-icon popup-with-zoom-anim">登录</a>
			</h5>
		</div>
	</div>
	
	
	<!-- 忘记密码 -->
		<div id="small-dialog2" class="mfp-hide w3ls_small_dialog">
		<h2>登录</h2>
		<div class="modal-body agileits_modal_body">
			<form action="LoginServlet" method="post">
				<span> <i class="glyphicon glyphicon-envelope"
					aria-hidden="true"></i> <input type="email" name="Email"
					placeholder="邮箱" required="" />
				</span> <span class="w3_modal"> <i class="glyphicon glyphicon-lock"
					aria-hidden="true"></i> <input type="text" name="Password"
					placeholder="密码" required="" />
				</span>
				<span class="w3_modal"> <i class="glyphicon glyphicon-lock"
					aria-hidden="true"></i> <input type="text" name="Password1"
					placeholder="再次输入密码" required="" />
				</span>
				<div class="agile_remember">
					<div class="agile_remember_left">
						
					</div>
					<div class="agile_remember_right">
						<a href=""></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<input type="submit" value="登录">
			</form>
			<h4>继续</h4>
			<div class="social_icons agileinfo_social_asd">
				<!-- Facebook -->
				<a href="#" class="slide-social wthree_slide_social">
					<div class="button">5 Likes</div>
					<div class="facebook icon">
						<i class="fa fa-facebook" aria-hidden="true"></i>
					</div>
					<div class="facebook slide">
						<p>Facebook</p>
					</div>
				</a>
				<!-- Twitter -->
				<a href="#" class="slide-social wthree_slide_social">
					<div class="button">8 Tweets</div>
					<div class="twitter icon">
						<i class="fa fa-twitter" aria-hidden="true"></i>
					</div>
					<div class="twitter slide">
						<p>Twitter</p>
					</div>
				</a>
			</div>
			<h5>
				没有账号? <a href="#small-dialog1"
					class="play-icon popup-with-zoom-anim">注册</a>
			</h5>
		</div>
	</div>
	
	
	
	
	<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
	<script>
		$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
				type : 'inline',
				fixedContentPos : false,
				fixedBgPos : true,
				overflowY : 'auto',
				closeBtnInside : true,
				preloader : false,
				midClick : true,
				removalDelay : 300,
				mainClass : 'my-mfp-zoom-in'
			});

		});
	</script>
	<!--//pop-up-box -->
	<!-- banner -->
	<div class="banner">
		<div
			class="fluid_dg_wrap fluid_dg_emboss pattern_1 fluid_dg_white_skin"
			id="fluid_dg_wrap_4">
			<div data-thumb="images/1-.jpg" data-src="images/1.jpg"></div>
			<div data-thumb="images/2-.jpg" data-src="images/2.jpg"></div>
			<div data-thumb="images/3-.jpg" data-src="images/3.jpg"></div>
			<div data-thumb="images/4-.jpg" data-src="images/4.jpg"></div>
			<div data-thumb="images/5-.jpg" data-src="images/5.jpg"></div>
		</div>
	</div>
	<!-- //banner -->
	<!-- banner-bottom-login -->
	<div class="banner-bottom-login">
		<div class="w3agile_banner_btom_login">
			<form action="PeopleServlet" method="post">
				<div class="w3agile__text w3agile_banner_btom_login_left">
					<h4>我要找一个</h4>
					<select id="country"
						class="frm-field required" name="sex">
						<option value="男" >男</option>
						<option value="女" >女</option>
					</select>
				</div>
				<div class="w3agile__text w3agile_banner_btom_login_left1">
					<h4>年龄</h4>
					<select id="country1" 
						class="frm-field required" name="age1">
						<option value="20" >20</option>
						<option value="21" >21</option>
						<option value="22" >22</option>
						<option value="23" >23</option>
						<option value="24">24</option>
						<option value="25" >25</option>
						<option value="25">- - -</option>
					</select> <span>到 </span> <select id="country2"
						 class="frm-field required" name="age2">
						<option value="23" >23</option>
						<option value="24">24</option>
						<option value="25" >25</option>
						<option value="26" >26</option>
						<option value="27" >27</option>
						<option value="28" >28</option>
						<option value="25">- - -</option>
					</select>
				</div>
				<div class="w3agile__text w3agile_banner_btom_login_left2">
					<h4>宗教信仰</h4>
					<select id="country3" onchange="change_country(this.value)"
						class="frm-field required" name="religion">
						<option value="基督教" >基督教</option>
						<option value="印度教" >印度教</option>
						<option value="伊斯兰教" >伊斯兰教</option>
						
						<option value="锡克教" >锡克教</option>
						<option value="耆那教" >耆那教</option>
						<option value="佛教">佛教</option>
						<option value="无宗教信仰" >没有宗教信仰</option>
					</select>
				</div>
				
				<div class="w3agile_banner_btom_login_left3">
					<input type="submit" value="查找"  style="width:100px; height :39px ; background-color:yello"/>
				</div>
			
				<div class="clearfix"></div>
			</form >
		</div>
	</div>
	<!-- //banner-bottom-login -->
	<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="agileinfo_banner_bottom">
			<span class="glyphicon glyphicon-heart-empty" aria-hidden="true"></span>
			<h3>创意婚礼节目和活动</h3>
			<p>Nulla auctor mattis neque, vitae dictum neque dignissim
				pellentesque. Duis finibus gravida lobortis. Fusce neque tellus,
				gravida et lectus ac, tristique accumsan ipsum.</p>
		</div>
		<div class="agileinfo_banner_bottom_grid">
			<div class="agileinfo_banner_bottom_grid_l">
				<h3>独家婚介服务</h3>
				<p>Nulla auctor mattis neque, vitae dictum neque dignissim
					pellentesque. Duis finibus gravida lobortis.</p>
				<div class="more">
					<a href="about.html" class="sim-button button9"><span>关于我们</span></a>
				</div>
			</div>
			<div class="agileinfo_banner_bottom_grid_r">
				<div class="agileinfo_banner_grid_r_grid">
					<img src="images/2.png" alt=" " class="img-responsive" />
				</div>
				<div class="agileinfo_banner_grid_r_grid">
					<img src="images/3.png" alt=" " class="img-responsive" />
				</div>
				<div class="agileinfo_banner_grid_r_grid">
					<img src="images/5.png" alt=" " class="img-responsive" />
				</div>
				<div class="clearfix"></div>
				<div class="agileinfo_banner_bottom_grid_r_sub">
					<div class="agileinfo_banner_grid_r_grid1">
						<img src="images/6.png" alt=" " class="img-responsive" />
					</div>
					<div class="agileinfo_banner_grid_r_grid1">
						<img src="images/4.png" alt=" " class="img-responsive" />
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //banner-bottom -->
	<!-- banner-bottom1 -->
	<div class="banner-bottom1">
		<h3>我们的任务是为您提供最合适的匹配</h3>
		<div class="more m1">
			<a href="contact.html" class="sim-button button9"><span>寄给我们</span></a>
		</div>
	</div>
	<!-- //banner-bottom1 -->
	<!-- footer-top -->
	<div class="footer-top">
		<div class="w3_footer_top_left">
			<img src="images/6.jpg" alt=" " class="img-responsive" />
		</div>
		<div class="w3_footer_top_right">
			<h3>Your wedding planning adventures</h3>
			<p>Cras pretium urna eu arcu euismod, ut laoreet tellus
				hendrerit. Fusce a tellus sodales, consequat felis a, suscipit nisi
				urabitur id purus.</p>
			<ul>
				<li><span class="glyphicon glyphicon-arrow-right"
					aria-hidden="true"></span>Purus rhoncus arcu tempor</li>
				<li><span class="glyphicon glyphicon-arrow-right"
					aria-hidden="true"></span>Laoreet tellus hendrerit</li>
				<li><span class="glyphicon glyphicon-arrow-right"
					aria-hidden="true"></span>Fusce a tellus sodales felis</li>
				<li><span class="glyphicon glyphicon-arrow-right"
					aria-hidden="true"></span>Curabitur id purus rhoncus</li>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
	<!-- //footer-top -->
	<!-- footer -->
	<div class="footer_app">
		<div class="agileits_footer_app_left">
			<h3>
				New Couple <span>Willson Mark<i> & </i>Laura Paul
				</span>
			</h3>
			<p>It is a story of hope, perseverance and an incredible love
				that cross borders, language and all differences.</p>
		</div>
		<div class="agileits_footer_app_right">
			<a href="#"><img src="images/8.png" alt=" "
				class="img-responsive" /></a>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="footer">
		<div class="agile_footer_grid">
			<h3>
				订阅 <span>新闻稿</span>
			</h3>
			<form action="#" method="post">
				<input type="email" name="Email" placeholder="邮箱" required="" /> <input
					type="submit" value="发送">
			</form>
		</div>
		<div class="footer-copy">
			<div class="w3agile_footer_grids">
				<div class="w3agile_footer_grid">
					<h3>关于我们</h3>
					<p>
						Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur
							sint occaecat cupidatat non proident, sunt in culpa qui officia
							deserunt mollit.</span>
					</p>
				</div>
				<div class="w3agile_footer_grid">
					<h3>联系方式</h3>
					<ul>
						<li><i class="glyphicon glyphicon-map-marker"
							aria-hidden="true"></i>1234k Avenue, 4th block, <span>New
								York City.</span></li>
						<li><i class="glyphicon glyphicon-envelope"
							aria-hidden="true"></i><a href="mailto:info@example.com">info@example.com</a></li>
						<li><i class="glyphicon glyphicon-earphone"
							aria-hidden="true"></i>+1234 567 567</li>
					</ul>
				</div>
				<div class="w3agile_footer_grid w3agile_footer_grid1">
					<h3>导航</h3>
					<ul>
						<li><span class="glyphicon glyphicon-menu-right"
							aria-hidden="true"></span><a href="about.html">关于我们</a></li>
						<li><span class="glyphicon glyphicon-menu-right"
							aria-hidden="true"></span><a href="gallery.html">画廊</a></li>
						<li><span class="glyphicon glyphicon-menu-right"
							aria-hidden="true"></span><a href="services.html">服务</a></li>
						<li><span class="glyphicon glyphicon-menu-right"
							aria-hidden="true"></span><a href="contact.html">联系我们</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="copy-right-social">
			<div class="footer-pos">
				<a href="#ban" class="scroll"><span></span></a>
			</div>
			<div class="copy-right">
				<p>
					&copy; 2016 Matchmaking. All rights reserved | Powered by <a
						href="http://www.smallseashell.com/">小贝壳网站模板</a>
				</p>
			</div>
			<div class="copy-right-social1">
				<ul class="wthree_social_icons1">
					<li><a href="#" class="icon1 w3_facebook"><i
							class="fa fa-facebook" aria-hidden="true"></i></a></li>
					<li><a href="#" class="icon1 w3_twitter"><i
							class="fa fa-twitter" aria-hidden="true"></i></a></li>
					<li><a href="#" class="icon1 w3_instagram"><i
							class="fa fa-instagram" aria-hidden="true"></i></a></li>
					<li><a href="#" class="icon1 w3_g_plus"><i
							class="fa fa-google-plus" aria-hidden="true"></i></a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //footer -->
	<!-- banner -->
	<script type='text/javascript' src='js/jquery.easing.1.3.js'></script>
	<script type='text/javascript' src='js/fluid_dg.min.js'></script>
	<script>
		jQuery(document).ready(function() {
			jQuery(function() {
				jQuery('#fluid_dg_wrap_4').fluid_dg({
					height : 'auto',
					loader : 'bar',
					pagination : false,
					thumbnails : true,
					hover : false,
					opacityOnGrid : false,
					imagePath : ''
				});
			});
		})
	</script>
	<!-- //banner -->
	<!-- nav -->
	<script>
		$(window).load(
				function() {
					$(".btn-nav").on(
							"click tap",
							function() {
								$(".nav-container").toggleClass(
										"showNav hideNav")
										.removeClass("hidden");
								$(this).toggleClass("animated");
							});
				});
	</script>
	<!-- //nav -->
</body>
</html>