.class public final enum Lde/a;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final enum c:Lde/a;

.field public static final synthetic d:[Lde/a;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lde/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const-string v3, "NO_ARGUMENTS"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Lde/a;-><init>(IILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lde/a;->c:Lde/a;

    .line 11
    .line 12
    new-instance v3, Lde/a;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    const-string v6, "UNLESS_EMPTY"

    .line 17
    .line 18
    invoke-direct {v3, v4, v5, v6}, Lde/a;-><init>(IILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v6, Lde/a;

    .line 22
    .line 23
    const-string v7, "ALWAYS_PARENTHESIZED"

    .line 24
    .line 25
    invoke-direct {v6, v7, v5, v4, v4}, Lde/a;-><init>(Ljava/lang/String;IZZ)V

    .line 26
    .line 27
    .line 28
    new-array v2, v2, [Lde/a;

    .line 29
    .line 30
    aput-object v0, v2, v1

    .line 31
    .line 32
    aput-object v3, v2, v4

    .line 33
    .line 34
    aput-object v6, v2, v5

    .line 35
    .line 36
    sput-object v2, Lde/a;->d:[Lde/a;

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public synthetic constructor <init>(IILjava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p3, p1, v0, v1}, Lde/a;-><init>(Ljava/lang/String;IZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-boolean p3, p0, Lde/a;->a:Z

    .line 4
    iput-boolean p4, p0, Lde/a;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lde/a;
    .locals 1

    .line 1
    const-class v0, Lde/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lde/a;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static values()[Lde/a;
    .locals 1

    .line 1
    sget-object v0, Lde/a;->d:[Lde/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lde/a;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
