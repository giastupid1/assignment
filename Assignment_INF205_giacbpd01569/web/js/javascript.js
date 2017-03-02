			function anhien()
			{
				var x = document.getElementById('login');
				if(status == "true")
				{
					x.style.display = "initial";
					status = "false";
				}
				else
				{
					x.style.display = "none";
					status = "true";
				}
			}
			
			
var bandau=0;
var soanh=6;
function load()
{
	bandau++;
	document.images['imgs'].src = "images/banner"+bandau+".jpg";
	setTimeout("auto()",3000);
}
	function auto()
	{
		bandau++;
		document.images['imgs'].src = "images/banner"+bandau+".jpg";
		if(bandau == soanh)
		{
			bandau = 0;
		}
		setTimeout("auto()",3000);
	}
	function back2()
	{
		if(bandau == 6)
		{
			bandau = 0;
		}
		if(bandau<6)
		{
			bandau++;
			document.images['imgs'].src = "images/banner"+bandau+".jpg";
		}
	} 
	function back()
	{
		if(bandau == 1)
		{
			bandau = 6;
		}
		if(bandau > 0)
		{
			bandau--;
			document.images['imgs'].src = "images/banner"+bandau+".jpg";
		}
		
		
	}
	

// js của trang đăng ký

function empty1()		 
		{
			var hovaten = document.getElementById('fullname').value;
			var tendangnhap = document.getElementById('account').value;
			var matkhau = document.getElementById('pass').value;
			var nhaplaimatkhau = document.getElementById('repeatpass').value;
			var email = document.getElementById('email').value;
                        var diachi = document.getElementById('email').value;
			var phonenumber = document.getElementById('phone').value;
			var x = false;
			
			for (var i = 0; i <document.form2.radio.length; i++)
			{
				if(document.form2.radio[i].checked == true)
				{
					x = true;
				}
			  
			} 
			
			
			if ( (tendangnhap.length > 0 && tendangnhap.length < 5) || tendangnhap.length > 12)
			{
				alert ('Tên đăng nhập phải từ 5 - 12 ký tự');
				document.getElementById('account').focus();
				return false;
			}
			if(tendangnhap.length == 0)
			{
				alert("Tên đăng nhập không được để trống !!!");
				return false;
			}
			
			if ( hovaten == "")
			{
				alert ('Họ và tên không được để trống');
				document.getElementById('fullname').focus();
				return false;
			}
			if ( matkhau !== nhaplaimatkhau)
			{
				alert ('Mật khẩu không trùng nhau, xin kiểm tra lại !');
				return false;
			}
			if ( email == "")
			{
				alert ('Email không được để trống');
				document.getElementById('email').focus();
				return false;
			}if ( diachi == "")
			{
				alert ('Địa chỉ  không được để trống');
				document.getElementById('diachi').focus();
				return false;
			}
			if(isNaN(phonenumber) == true || phonenumber.length < 10 || phonenumber.length >11 )
			{
				alert("Số điện thoại phải là số và có 10-11 ký tự !");
				return false;
			}
			if(email.search("@") == -1)
			{
				alert("Email phải để đúng định dạng abc@xyz...");
				return false;
			}
			if ( x == false)
			{
				alert ('Bạn chưa chọn giới tính');
				return false;
			}
				
			
			alert ('Nhập dữ liệu thành công. Chúc mừng bạn !!!');
			
			
		}