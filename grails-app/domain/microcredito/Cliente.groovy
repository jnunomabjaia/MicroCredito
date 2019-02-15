package microcredito

class Cliente {
    String codigo, apelido, nome, estadoCivil, nomeConjuge, tipoContrato, anoAdmissao, estado, nrDocumento, localEmissao,
            contacto1, contacto2,email, testemunhas, endereco, tipoCasa
    int  nrDependentes, nrFilhos
    TipoDocumento tipoDocumento
    Date dataEmissao, dataValidade, dataRegisto, dataModif
    User userModif, userRegisto
    Cliente avalista
    Distrito distrito

    static  hasMany = [emprestimos: Emprestimo]
    static belongsTo = [distrito: Distrito, tipoDocumento: TipoDocumento]

    static constraints = {
        codigo(blank: false, maxSize: 45)
        apelido(blank: false, nullable: false, maxSize: 45)
        nome(blank: false, nullable: false, maxSize: 45)
        nomeConjuge(blank: true, maxSize: 100)
        tipoContrato(blank: true, maxSize: 100)
        anoAdmissao(blank: true)
        estado(inList: ["Activo", "Bloqueado", "Lista_Negra"], maxSize: 45)
        estadoCivil(inList: ["Solteiro", "Casado", "Viuvo"], maxSize: 45)
        nrDocumento(blank: true, maxSize: 45)
        localEmissao(blank: true, maxSize: 45)
        contacto1(blank: true, maxSize: 45)
        contacto2(blank: true, maxSize: 45)
        testemunhas(blank: true, maxSize: 500)
        endereco (blank: true, maxSize: 500)
        nrDependentes(blank: true, min:0)
        nrFilhos(blank: true, min:0)
        tipoDocumento(blank:false, nullable: false)
        avalista(nullable: true)
        tipoCasa(nullable: false, inList: ['Propria','Arrendada','Outra'])
        dataEmissao(nullable: true, blank:true)
        dataValidade(nullable: true, blank:true)
        userRegisto(nullable: true, blank:true)
        userModif(nullable: true, blank:true)
        dataRegisto(nullable: true, blank:true)
        dataModif(nullable: true, blank:true)
    }
}