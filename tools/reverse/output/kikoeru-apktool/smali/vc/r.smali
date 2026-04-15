.class public final enum Lvc/r;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic d:[Lvc/r;


# instance fields
.field public final a:Lbe/b;

.field public final b:Lbe/e;

.field public final c:Lbe/b;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lvc/r;

    .line 2
    .line 3
    const-string v1, "kotlin/UByte"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v1, v2}, Llc/b;->v(Ljava/lang/String;Z)Lbe/b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v3, "UBYTE"

    .line 11
    .line 12
    invoke-direct {v0, v3, v2, v1}, Lvc/r;-><init>(Ljava/lang/String;ILbe/b;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lvc/r;

    .line 16
    .line 17
    const-string v3, "kotlin/UShort"

    .line 18
    .line 19
    invoke-static {v3, v2}, Llc/b;->v(Ljava/lang/String;Z)Lbe/b;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "USHORT"

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-direct {v1, v4, v5, v3}, Lvc/r;-><init>(Ljava/lang/String;ILbe/b;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lvc/r;

    .line 30
    .line 31
    const-string v4, "kotlin/UInt"

    .line 32
    .line 33
    invoke-static {v4, v2}, Llc/b;->v(Ljava/lang/String;Z)Lbe/b;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const-string v6, "UINT"

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    invoke-direct {v3, v6, v7, v4}, Lvc/r;-><init>(Ljava/lang/String;ILbe/b;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Lvc/r;

    .line 44
    .line 45
    const-string v6, "kotlin/ULong"

    .line 46
    .line 47
    invoke-static {v6, v2}, Llc/b;->v(Ljava/lang/String;Z)Lbe/b;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v8, "ULONG"

    .line 52
    .line 53
    const/4 v9, 0x3

    .line 54
    invoke-direct {v4, v8, v9, v6}, Lvc/r;-><init>(Ljava/lang/String;ILbe/b;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    new-array v6, v6, [Lvc/r;

    .line 59
    .line 60
    aput-object v0, v6, v2

    .line 61
    .line 62
    aput-object v1, v6, v5

    .line 63
    .line 64
    aput-object v3, v6, v7

    .line 65
    .line 66
    aput-object v4, v6, v9

    .line 67
    .line 68
    sput-object v6, Lvc/r;->d:[Lvc/r;

    .line 69
    .line 70
    return-void
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

.method public constructor <init>(Ljava/lang/String;ILbe/b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lvc/r;->a:Lbe/b;

    .line 5
    .line 6
    invoke-virtual {p3}, Lbe/b;->f()Lbe/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lvc/r;->b:Lbe/e;

    .line 11
    .line 12
    new-instance p2, Lbe/b;

    .line 13
    .line 14
    iget-object p3, p3, Lbe/b;->a:Lbe/c;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lbe/e;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, "Array"

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p2, p3, p1}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lvc/r;->c:Lbe/b;

    .line 45
    .line 46
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static valueOf(Ljava/lang/String;)Lvc/r;
    .locals 1

    .line 1
    const-class v0, Lvc/r;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvc/r;

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

.method public static values()[Lvc/r;
    .locals 1

    .line 1
    sget-object v0, Lvc/r;->d:[Lvc/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lvc/r;

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
