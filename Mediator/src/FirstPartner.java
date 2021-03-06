class FirstPartner extends Partner {
    public FirstPartner(Mediator mediator) {
        super(mediator);
        mediator.registerFirstPartner(this);
    }

    public String execute() {
        return "First Partner";
    }
}
