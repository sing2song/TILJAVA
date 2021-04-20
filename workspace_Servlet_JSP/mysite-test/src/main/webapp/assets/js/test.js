//1. 사용자가 접근한 주소 저장하기

localStorage.setItem(window.location.href,window.location.href);
//console에 뿌려서 확인하기
console.log("접근주소: "+localStorage.getItem(window.location.href));
;

for(var i=0;i<localStorage.length;i++){

let key = localStorage.key(i); 
var newP = document.createElement("p");
newP.innerText="접근주소: "+localStorage.getItem(key);
document.getElementById("access").appendChild(newP);
console.log(key+":"+localStorage.getItem(key));
}


//2.사용자가 클릭한 내용을 리스트로 표현하시오. 
window.addEventListener("click",function(){   
	var allTag = document.getElementsByTagName("*");
    allTag.onclick=showCoords(event);
}); 

function showCoords(event) {
    var content = event.target.innerText;
	var tagName = event.target.tagName;
	//event.target.style.background="blue";//클릭확인용
    //console에 뿌려서 확인하기
	console.log("지금 클릭한 내용은 " + content + " 입니다 ");

	var newLi = document.createElement("li");
	newLi.innerText = tagName+"태그의 내용은 "+content;
	document.getElementById("clickList").appendChild(newLi);
}

