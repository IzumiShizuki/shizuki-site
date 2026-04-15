.class public final Lu6/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Lya/m0;

.field public static final f:Lya/m0;

.field public static final g:Lya/m0;

.field public static final h:Lya/m0;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "\\s+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lu6/b;->d:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v1, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "auto"

    .line 14
    .line 15
    aput-object v3, v1, v2

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const-string v4, "none"

    .line 19
    .line 20
    aput-object v4, v1, v3

    .line 21
    .line 22
    invoke-static {v0, v1}, Lya/m0;->p(I[Ljava/lang/Object;)Lya/m0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Lu6/b;->e:Lya/m0;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    new-array v4, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v5, "dot"

    .line 32
    .line 33
    aput-object v5, v4, v2

    .line 34
    .line 35
    const-string v5, "sesame"

    .line 36
    .line 37
    aput-object v5, v4, v3

    .line 38
    .line 39
    const-string v5, "circle"

    .line 40
    .line 41
    aput-object v5, v4, v0

    .line 42
    .line 43
    invoke-static {v1, v4}, Lya/m0;->p(I[Ljava/lang/Object;)Lya/m0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    sput-object v4, Lu6/b;->f:Lya/m0;

    .line 48
    .line 49
    new-array v4, v0, [Ljava/lang/Object;

    .line 50
    .line 51
    const-string v5, "filled"

    .line 52
    .line 53
    aput-object v5, v4, v2

    .line 54
    .line 55
    const-string v5, "open"

    .line 56
    .line 57
    aput-object v5, v4, v3

    .line 58
    .line 59
    invoke-static {v0, v4}, Lya/m0;->p(I[Ljava/lang/Object;)Lya/m0;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sput-object v4, Lu6/b;->g:Lya/m0;

    .line 64
    .line 65
    new-array v4, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v5, "after"

    .line 68
    .line 69
    aput-object v5, v4, v2

    .line 70
    .line 71
    const-string v2, "before"

    .line 72
    .line 73
    aput-object v2, v4, v3

    .line 74
    .line 75
    const-string v2, "outside"

    .line 76
    .line 77
    aput-object v2, v4, v0

    .line 78
    .line 79
    invoke-static {v1, v4}, Lya/m0;->p(I[Ljava/lang/Object;)Lya/m0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lu6/b;->h:Lya/m0;

    .line 84
    .line 85
    return-void
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

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu6/b;->a:I

    .line 5
    .line 6
    iput p2, p0, Lu6/b;->b:I

    .line 7
    .line 8
    iput p3, p0, Lu6/b;->c:I

    .line 9
    .line 10
    return-void
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
