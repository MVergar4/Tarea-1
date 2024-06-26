package org.example;

/**
 * Expendedor al que se le puede comprar un artículo seleccionado a cambio de una moneda
 */
public class Expendedor {
    /** Deposito de productos para almacenar CocaCola */
    private Deposito<Producto> coca = new Deposito();
    /** Deposito de productos para almacenar Sprite */
    private Deposito<Producto> sprite = new Deposito();
    /** Deposito de productos para almacenar Fanta */
    private Deposito<Producto> fanta = new Deposito();
    /** Deposito de productos para almacenar Snickers */
    private Deposito<Producto> snickers = new Deposito();
    /** Deposito de productos para almacenar Super8 */
    private Deposito<Producto> super8 = new Deposito();
    /** Deposito de monedas para almacenar el vuelto */
    private Deposito<Moneda> monVu;

    /**
     * Constructor, crea y llena los depósitos de cada artículo
     * @param numProductos cantidad de productos en cada depósito
     */
    public Expendedor(int numProductos) {
        for (int i = 0; i < numProductos; i++) {
            Producto p = null;
            p = new CocaCola();
            coca.addObject(p);
            p = new Sprite();
            sprite.addObject(p);
            p = new Fanta();
            fanta.addObject(p);
            p = new Snickers();
            snickers.addObject(p);
            p = new Super8();
            super8.addObject(p);
        }
    }

    /**
     * Simula la compra en una máquina expendedora, se entrega una moneda y se selecciona un producto, si la compra es exitosa entonces devuelve el producto
     * @param m moneda para comprar
     * @param cual indica qué producto se desea comprar
     * @return producto seleccionado
     * @throws PagoIncorrectoException puede lanzar esta excepción si se trata de comprar con una moneda null
     * @throws NoHayProductoException puede lanzar esta excepción si el depósito del producto seleccionado está vacío o si el número de seleccion no corresponde a ningún producto
     * @throws PagoInsuficienteException puede lanzar esta excepción si la moneda entregada no alcanza para comprar el producto
     */
    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("Error, no se ha entregado moneda");
        } else {
            monVu = new Deposito();
            if (cual == Articulos.COCA.ordinal()) {
                if (coca.checkObject()) {
                    if (m.compareTo(Articulos.COCA.getDiferencia())<0) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar CocaCola");
                    } else if (m.compareTo(Articulos.COCA.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.COCA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return coca.getObject();
                    } else {
                        return coca.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    throw new NoHayProductoException("Error, no queda CocaCola en el depósito");
                }
            } else if (cual == Articulos.SPRITE.ordinal()) {
                if (sprite.checkObject()) {
                    if (m.compareTo(Articulos.SPRITE.getDiferencia())<0) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Sprite");
                    } else if (m.compareTo(Articulos.SPRITE.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SPRITE.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return sprite.getObject();
                    } else {
                        return sprite.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    throw new NoHayProductoException("Error, no queda Sprite en el depósito");
                }
            } else if (cual == Articulos.FANTA.ordinal()) {
                if (fanta.checkObject()) {
                    if (m.compareTo(Articulos.FANTA.getDiferencia())<0) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Fanta");
                    } else if (m.compareTo(Articulos.FANTA.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.FANTA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return fanta.getObject();
                    } else {
                        return fanta.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    throw new NoHayProductoException("Error, no queda Fanta en el depósito");
                }
            } else if (cual == Articulos.SNICKERS.ordinal()) {
                if (snickers.checkObject()) {
                    if (m.compareTo(Articulos.SNICKERS.getDiferencia())<0) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Snickers");
                    } else if (m.compareTo(Articulos.SNICKERS.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SNICKERS.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return snickers.getObject();
                    } else {
                        return snickers.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    throw new NoHayProductoException("Error, no quedan Snickers en el depósito");
                }
            } else if (cual == Articulos.SUPER8.ordinal()) {
                if  (super8.checkObject()) {
                    if (m.compareTo(Articulos.SUPER8.getDiferencia())<0) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        throw new PagoInsuficienteException("Error, el valor de la moneda no alcanza para comprar Super8");
                    } else if (m.compareTo(Articulos.SUPER8.getDiferencia())>0) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SUPER8.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return super8.getObject();
                    } else {
                        return super8.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    throw new NoHayProductoException("Error, no quedan Super8 en el depósito");
                }
            } else {
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    Moneda m100 = null;
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                }
                throw new NoHayProductoException("Error, no hay producto que corresponda al número seleccionado");
            }
        }
    }

    /**
     * Devuelve una de las monedas almacenadas en el depósito de monedas
     * @return Moneda100 del depósito
     */
    public Moneda getVuelto() {
        return monVu.getObject();
    }
}