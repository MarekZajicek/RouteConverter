//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.13 at 10:12:26 PM MESZ 
//


package slash.navigation.kml.binding22;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for IconStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IconStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractColorStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}scale" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}heading" minOccurs="0"/>
 *         &lt;element name="Icon" type="{http://www.opengis.net/kml/2.2}BasicLinkType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}hotSpot" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}IconStyleSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}IconStyleObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IconStyleType", propOrder = {
    "scaleElement",
    "heading",
    "icon",
    "hotSpot",
    "iconStyleSimpleExtensionGroup",
    "iconStyleObjectExtensionGroup"
})
public class IconStyleType
    extends AbstractColorStyleType
{

    @XmlElementRef(name = "scale", namespace = "http://www.opengis.net/kml/2.2", type = ScaleElement.class)
    protected ScaleElement scaleElement;
    @XmlElement(defaultValue = "0.0")
    protected Double heading;
    @XmlElement(name = "Icon")
    protected BasicLinkType icon;
    protected Vec2Type hotSpot;
    @XmlElement(name = "IconStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> iconStyleSimpleExtensionGroup;
    @XmlElement(name = "IconStyleObjectExtensionGroup")
    protected List<AbstractObjectType> iconStyleObjectExtensionGroup;

    /**
     * Gets the value of the scaleElement property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleElement }
     *     
     */
    public ScaleElement getScaleElement() {
        return scaleElement;
    }

    /**
     * Sets the value of the scaleElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleElement }
     *     
     */
    public void setScaleElement(ScaleElement value) {
        this.scaleElement = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeading(Double value) {
        this.heading = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link BasicLinkType }
     *     
     */
    public BasicLinkType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLinkType }
     *     
     */
    public void setIcon(BasicLinkType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the hotSpot property.
     * 
     * @return
     *     possible object is
     *     {@link Vec2Type }
     *     
     */
    public Vec2Type getHotSpot() {
        return hotSpot;
    }

    /**
     * Sets the value of the hotSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vec2Type }
     *     
     */
    public void setHotSpot(Vec2Type value) {
        this.hotSpot = value;
    }

    /**
     * Gets the value of the iconStyleSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iconStyleSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIconStyleSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getIconStyleSimpleExtensionGroup() {
        if (iconStyleSimpleExtensionGroup == null) {
            iconStyleSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.iconStyleSimpleExtensionGroup;
    }

    /**
     * Gets the value of the iconStyleObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iconStyleObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIconStyleObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getIconStyleObjectExtensionGroup() {
        if (iconStyleObjectExtensionGroup == null) {
            iconStyleObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.iconStyleObjectExtensionGroup;
    }

}
