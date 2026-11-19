import unittest
from unittest.mock import patch
from check_flyway_history import validate, migrations, locations

a, b, c = sorted(locations)
base = {f"{a}/V1028__base.sql": (a, (1028,), "a"), f"{b}/V40__base.sql": (b, (40,), "b"), f"{c}/V13__base.sql": (c, (13,), "c")}

class GuardTests(unittest.TestCase):
    def test_additive_dialect_specific(self):
        case = dict(base)
        case[f"{a}/V1029__todo.sql"] = (a, (1029,), "c")
        case[f"{b}/V41__todo.sql"] = (b, (41,), "d")
        self.assertEqual([], validate(case, base))

    def test_duplicate_and_old_slot(self):
        case = dict(base)
        case[f"{a}/V1028__other.sql"] = (a, (1028,), "c")
        case[f"{a}/V1020__old.sql"] = (a, (1020,), "d")
        issues = validate(case, base)
        self.assertEqual(1, sum("Duplicate" in v for v in issues))
        self.assertEqual(2, sum("does not follow" in v for v in issues))

    def test_flyway_version_aliases_conflict(self):
        result = (
            f"100644 blob abc\t{a}/V1028__base.sql\0"
            f"100644 blob def\t{a}/V01028.0__alias.sql\0"
        ).encode()
        with patch("check_flyway_history.subprocess.check_output", return_value=result):
            candidate = migrations("test")
        issues = validate({**base, **candidate}, base)
        self.assertTrue(any("Duplicate Flyway version" in issue for issue in issues))


    def test_change_and_remove(self):
        case = {f"{a}/V1028__base.sql": (a, (1028,), "x")}
        self.assertEqual(3, sum("changed or missing" in v for v in validate(case, base)))

if __name__ == "__main__":
    unittest.main()
