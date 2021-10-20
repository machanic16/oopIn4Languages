<?php
require_once('payment.php');

class Card extends Payment{
  public $number;
  public $cvv;
  public $expDate;
  public $owner;
  public function __construct($number, $cvv, $expDate, $owner){
    parent::__construct();
    $this->number = $number;
    $this->cvv = $cvv;
    $this->expDate = $expDate;
    $this->owner = $owner;    
  }
}