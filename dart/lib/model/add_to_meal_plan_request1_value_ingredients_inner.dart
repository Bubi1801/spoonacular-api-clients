//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AddToMealPlanRequest1ValueIngredientsInner {
  /// Returns a new [AddToMealPlanRequest1ValueIngredientsInner] instance.
  AddToMealPlanRequest1ValueIngredientsInner({
    required this.name,
  });

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AddToMealPlanRequest1ValueIngredientsInner &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode);

  @override
  String toString() => 'AddToMealPlanRequest1ValueIngredientsInner[name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [AddToMealPlanRequest1ValueIngredientsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AddToMealPlanRequest1ValueIngredientsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AddToMealPlanRequest1ValueIngredientsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AddToMealPlanRequest1ValueIngredientsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AddToMealPlanRequest1ValueIngredientsInner(
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<AddToMealPlanRequest1ValueIngredientsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AddToMealPlanRequest1ValueIngredientsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AddToMealPlanRequest1ValueIngredientsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AddToMealPlanRequest1ValueIngredientsInner> mapFromJson(dynamic json) {
    final map = <String, AddToMealPlanRequest1ValueIngredientsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AddToMealPlanRequest1ValueIngredientsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AddToMealPlanRequest1ValueIngredientsInner-objects as value to a dart map
  static Map<String, List<AddToMealPlanRequest1ValueIngredientsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AddToMealPlanRequest1ValueIngredientsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AddToMealPlanRequest1ValueIngredientsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

