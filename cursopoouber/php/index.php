<?php

require_once('car.php');
require_once('uberX.php');
require_once('account.php');
require_once('UberPool.php');
require_once('driver.php');

$uberX = new UberX("AW456", new Driver("Andres Herrera", "AMS123", "D@gmai.com"), "BMW", "i6");
$uberX->printDataCar();

$uberPool = new UberPool("QQ786", new Driver("Joel Tovar", "TVJ643", "J@gmail.com"), "BMW", "i8");
$uberPool->printDataCar();