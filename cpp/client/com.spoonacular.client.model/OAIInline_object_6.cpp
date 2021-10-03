/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIInline_object_6.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIInline_object_6::OAIInline_object_6(QString json) {
    this->init();
    this->fromJson(json);
}

OAIInline_object_6::OAIInline_object_6() {
    this->init();
}

OAIInline_object_6::~OAIInline_object_6() {

}

void
OAIInline_object_6::init() {
    
    m_username_isSet = false;
    m_username_isValid = false;
    
    m_hash_isSet = false;
    m_hash_isValid = false;
    }

void
OAIInline_object_6::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIInline_object_6::fromJsonObject(QJsonObject json) {
    
    m_username_isValid = ::OpenAPI::fromJsonValue(username, json[QString("username")]);
    
    
    m_hash_isValid = ::OpenAPI::fromJsonValue(hash, json[QString("hash")]);
    
    
}

QString
OAIInline_object_6::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIInline_object_6::asJsonObject() const {
    QJsonObject obj;
	if(m_username_isSet){
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(username));
    }
	if(m_hash_isSet){
        obj.insert(QString("hash"), ::OpenAPI::toJsonValue(hash));
    }
    return obj;
}


QString
OAIInline_object_6::getUsername() const {
    return username;
}
void
OAIInline_object_6::setUsername(const QString &username) {
    this->username = username;
    this->m_username_isSet = true;
}


QString
OAIInline_object_6::getHash() const {
    return hash;
}
void
OAIInline_object_6::setHash(const QString &hash) {
    this->hash = hash;
    this->m_hash_isSet = true;
}

bool
OAIInline_object_6::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_username_isSet){ isObjectUpdated = true; break;}
    
        if(m_hash_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIInline_object_6::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_username_isValid && m_hash_isValid && true;
}

}

