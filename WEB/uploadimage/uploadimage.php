<?php 
	$part = "./upload/";
	$filename = "img".rand(9,9999).".jpg";

	$res = array(); 
	$kode = ""; 
	$pesan = ""; 


	if($_SERVER['REQUEST_METHOD'] == "POST")
	{
		if($_FILES['imageupload'])
		{
			$destinationfile = $part.$filename;
			if(move_uploaded_file($_FILES['imageupload']['tmp_name'], $destinationfile))
			{
				$kode = 1; 
				$pesan = "Berhasil Upload";
			}else
			{
				$kode = 0; 
				$pesan = "Gagal Upload";
			}
		}else{
			$kode = 0; 
			$pesan = "request error";
		}
	}else
	{
		$kode = 0; 
		$pesan = "Request tidak valid";
	}

	$res['kode'] = $kode; 
	$res['pesan'] = $pesan; 

	echo json_encode($res);

 ?>