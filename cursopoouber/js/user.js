class User extends Account {
  constructor(name, document, email) {
    super(name, document);
    this.email = email;
  }
}
