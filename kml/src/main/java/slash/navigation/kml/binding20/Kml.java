//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.17 at 01:40:15 PM MEZ
//


package slash.navigation.kml.binding20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Response"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Document"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Folder"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Placemark"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LookAt"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}NetworkLink"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}NetworkLinkControl"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}GroundOverlay"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}ScreenOverlay"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response",
    "document",
    "folder",
    "placemark",
    "lookAt",
    "networkLink",
    "networkLinkControl",
    "groundOverlay",
    "screenOverlay"
})
@XmlRootElement(name = "kml")
public class Kml {

    @XmlElement(name = "Response")
    protected Response response;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "Folder")
    protected Folder folder;
    @XmlElement(name = "Placemark")
    protected Placemark placemark;
    @XmlElement(name = "LookAt")
    protected LookAt lookAt;
    @XmlElement(name = "NetworkLink")
    protected NetworkLink networkLink;
    @XmlElement(name = "NetworkLinkControl")
    protected NetworkLinkControl networkLinkControl;
    @XmlElement(name = "GroundOverlay")
    protected GroundOverlay groundOverlay;
    @XmlElement(name = "ScreenOverlay")
    protected ScreenOverlay screenOverlay;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link Folder }
     *     
     */
    public Folder getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder }
     *     
     */
    public void setFolder(Folder value) {
        this.folder = value;
    }

    /**
     * Gets the value of the placemark property.
     * 
     * @return
     *     possible object is
     *     {@link Placemark }
     *     
     */
    public Placemark getPlacemark() {
        return placemark;
    }

    /**
     * Sets the value of the placemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placemark }
     *     
     */
    public void setPlacemark(Placemark value) {
        this.placemark = value;
    }

    /**
     * Gets the value of the lookAt property.
     * 
     * @return
     *     possible object is
     *     {@link LookAt }
     *     
     */
    public LookAt getLookAt() {
        return lookAt;
    }

    /**
     * Sets the value of the lookAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookAt }
     *     
     */
    public void setLookAt(LookAt value) {
        this.lookAt = value;
    }

    /**
     * Gets the value of the networkLink property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkLink }
     *     
     */
    public NetworkLink getNetworkLink() {
        return networkLink;
    }

    /**
     * Sets the value of the networkLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkLink }
     *     
     */
    public void setNetworkLink(NetworkLink value) {
        this.networkLink = value;
    }

    /**
     * Gets the value of the networkLinkControl property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkLinkControl }
     *     
     */
    public NetworkLinkControl getNetworkLinkControl() {
        return networkLinkControl;
    }

    /**
     * Sets the value of the networkLinkControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkLinkControl }
     *     
     */
    public void setNetworkLinkControl(NetworkLinkControl value) {
        this.networkLinkControl = value;
    }

    /**
     * Gets the value of the groundOverlay property.
     * 
     * @return
     *     possible object is
     *     {@link GroundOverlay }
     *     
     */
    public GroundOverlay getGroundOverlay() {
        return groundOverlay;
    }

    /**
     * Sets the value of the groundOverlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundOverlay }
     *     
     */
    public void setGroundOverlay(GroundOverlay value) {
        this.groundOverlay = value;
    }

    /**
     * Gets the value of the screenOverlay property.
     * 
     * @return
     *     possible object is
     *     {@link ScreenOverlay }
     *     
     */
    public ScreenOverlay getScreenOverlay() {
        return screenOverlay;
    }

    /**
     * Sets the value of the screenOverlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenOverlay }
     *     
     */
    public void setScreenOverlay(ScreenOverlay value) {
        this.screenOverlay = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
