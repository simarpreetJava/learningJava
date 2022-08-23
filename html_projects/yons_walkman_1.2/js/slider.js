function imgSlider(input) {//slide2
  const fetchedDiv = document.querySelector(`#${input}`);
  const divArr = [...document.querySelector(".slides").children];
  
  divArr.forEach((element) => 
							 element.classList.remove("active"));
  
  fetchedDiv.classList.add("active");
}


let imgIndex = 1;
//lambda function: ES6
setInterval(() => {
					imgIndex++;//2
					if (imgIndex === 6) 
						imgIndex = 1;
					
					imgSlider(`slide${imgIndex}`);//slide2 "slide"+imgIndex
					
				  }, 2600);
