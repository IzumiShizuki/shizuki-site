.class public final enum Lhd/o;
.super Ljava/lang/Enum;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final enum b:Lhd/o;

.field public static final enum c:Lhd/o;

.field public static final enum d:Lhd/o;

.field public static final enum e:Lhd/o;

.field public static final enum f:Lhd/o;

.field public static final enum g:Lhd/o;

.field public static final enum h:Lhd/o;

.field public static final synthetic i:[Lhd/o;

.field public static final synthetic j:Lbc/b;


# instance fields
.field public final a:Li7/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lhd/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "CLASS"

    .line 5
    .line 6
    invoke-direct {v0, v1, v1, v2}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhd/o;->b:Lhd/o;

    .line 10
    .line 11
    new-instance v2, Lhd/o;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const-string v4, "INTERFACE"

    .line 15
    .line 16
    invoke-direct {v2, v3, v3, v4}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lhd/o;->c:Lhd/o;

    .line 20
    .line 21
    new-instance v4, Lhd/o;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const-string v6, "ENUM_CLASS"

    .line 25
    .line 26
    invoke-direct {v4, v5, v5, v6}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lhd/o;->d:Lhd/o;

    .line 30
    .line 31
    new-instance v6, Lhd/o;

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    const-string v8, "ENUM_ENTRY"

    .line 35
    .line 36
    invoke-direct {v6, v7, v7, v8}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v6, Lhd/o;->e:Lhd/o;

    .line 40
    .line 41
    new-instance v8, Lhd/o;

    .line 42
    .line 43
    const/4 v9, 0x4

    .line 44
    const-string v10, "ANNOTATION_CLASS"

    .line 45
    .line 46
    invoke-direct {v8, v9, v9, v10}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v8, Lhd/o;->f:Lhd/o;

    .line 50
    .line 51
    new-instance v10, Lhd/o;

    .line 52
    .line 53
    const/4 v11, 0x5

    .line 54
    const-string v12, "OBJECT"

    .line 55
    .line 56
    invoke-direct {v10, v11, v11, v12}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v10, Lhd/o;->g:Lhd/o;

    .line 60
    .line 61
    new-instance v12, Lhd/o;

    .line 62
    .line 63
    const/4 v13, 0x6

    .line 64
    const-string v14, "COMPANION_OBJECT"

    .line 65
    .line 66
    invoke-direct {v12, v13, v13, v14}, Lhd/o;-><init>(IILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sput-object v12, Lhd/o;->h:Lhd/o;

    .line 70
    .line 71
    const/4 v14, 0x7

    .line 72
    new-array v14, v14, [Lhd/o;

    .line 73
    .line 74
    aput-object v0, v14, v1

    .line 75
    .line 76
    aput-object v2, v14, v3

    .line 77
    .line 78
    aput-object v4, v14, v5

    .line 79
    .line 80
    aput-object v6, v14, v7

    .line 81
    .line 82
    aput-object v8, v14, v9

    .line 83
    .line 84
    aput-object v10, v14, v11

    .line 85
    .line 86
    aput-object v12, v14, v13

    .line 87
    .line 88
    sput-object v14, Lhd/o;->i:[Lhd/o;

    .line 89
    .line 90
    new-instance v0, Lbc/b;

    .line 91
    .line 92
    invoke-direct {v0, v14}, Lbc/b;-><init>([Ljava/lang/Enum;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lhd/o;->j:Lbc/b;

    .line 96
    .line 97
    return-void
    .line 98
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Li7/j1;

    .line 5
    .line 6
    sget-object p3, Lyd/d;->f:Lyd/c;

    .line 7
    .line 8
    const-string v0, "CLASS_KIND"

    .line 9
    .line 10
    invoke-static {p3, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, p3, p2}, Li7/j1;-><init>(Ly0/i0;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lhd/o;->a:Li7/j1;

    .line 17
    .line 18
    return-void
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
    .line 37
    .line 38
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

.method public static valueOf(Ljava/lang/String;)Lhd/o;
    .locals 1

    .line 1
    const-class v0, Lhd/o;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhd/o;

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

.method public static values()[Lhd/o;
    .locals 1

    .line 1
    sget-object v0, Lhd/o;->i:[Lhd/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lhd/o;

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
