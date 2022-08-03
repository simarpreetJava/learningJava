

//HEADER FOOTER
function createHeaderAndFooter() {
    
	var header="<header><span id=\"header-title\">Yons  </span><img src=\"img/yons_logo.png\" id=\"header-img\"/><nav id=\"nav-bar\"><ul><a href=\"index.html\">Home</a> |<a href=\"product.html\">Product</a> |<a href=\"contact.html\">Contact</a> |<a href=\"about.html\">About</a></ul></nav></header>";
    
	var footer="<footer id = \"base\" class=\"footer section\"><div class=\"footer__container container grid\"> <div class=\"footer__content grid\"><div class=\"footer__data\"><h3 class=\"footer__title\">Yons</h3><p class=\"footer__description\">Device you choose <br>the unprecendeted quality  we offer <br> the experience you savor.</p></div>   <div class=\"footer__data\"><h3 class=\"footer__subtitle ft\">About</h3><ul> <li class=\"footer__item\"><a href=\"about.html\" class=\"footer__link ft\">About Us</a> </li> <li class=\"footer__item\"><a href=\"product.html\" class=\"footer__link\">Features</a> </li></ul></div>   <div class=\"footer__data\"><h3 class=\"footer__subtitle\">Company</h3><ul> <li class=\"footer__item\"><a href=\"about.html\" class=\"footer__link\">Team</a> </li> <li class=\"footer__item\"><a href=\"product.html\" class=\"footer__link\">Plan & Pricing</a> </li></ul></div>   <div class=\"footer__data\"><h3 class=\"footer__subtitle\">Contact</h3><ul> <li class=\"footer__item\"><a href=\"contact.html\" class=\"footer__link\">Email</a> </li> <li class=\"footer__item\"><a href=\"contact.html\" class=\"footer__link\">Phone</a> </li></ul></div> </div> <div class=\"footer__rights\"><p class=\"footer__copy\">&#169; 2022 Yons. All rigths reserved.</p> </div></div></footer>";
    
	document.body.innerHTML = header + document.body.innerHTML + footer;
}
window.addEventListener("load", createHeaderAndFooter);



