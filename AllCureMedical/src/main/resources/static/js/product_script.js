var retailRate = document.getElementById("retail")
var wholeSaleRate = document.getElementById("wholeSale")
var theirInput1 = 0;
var theirInput2 = 0;
retailRate.addEventListener('change', function(e) { 
theirInput1 = e.target.value;  
  });
wholeSaleRate.addEventListener('change', function(e) { 
theirInput2 = e.target.value;  
  });   
 
var submitButton = document.getElementById("test");

submitButton.onclick = function(){
var status = CompareRrateWSrate()
if (status) {
    submitButton.disabled = true;
    alert("Retail rate must be greater than Wholesale rate")
    location.reload()
 } else {
    submitButton.disabled = false;
 }
};

    function CompareRrateWSrate() {
        if(theirInput1<theirInput2){
            return true
        }
        return false
    }