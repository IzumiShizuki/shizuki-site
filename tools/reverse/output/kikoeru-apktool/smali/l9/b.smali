.class public final Ll9/b;
.super Ll9/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic l:[Lpc/u;


# instance fields
.field public final k:Lhg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Ll9/b;

    .line 4
    .line 5
    const-string v2, "enable"

    .line 6
    .line 7
    const-string v3, "getEnable()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    new-array v1, v1, [Lpc/u;

    .line 21
    .line 22
    aput-object v0, v1, v4

    .line 23
    .line 24
    sput-object v1, Ll9/b;->l:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ll9/a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "mergeAudio"

    .line 17
    .line 18
    invoke-static {v1, v3, v0, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Ll9/b;->k:Lhg/b;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final l(Ljava/nio/ByteBuffer;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Ll9/a;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    sget-object v0, Ll9/b;->l:[Lpc/u;

    .line 7
    .line 8
    aget-object v0, v0, v1

    .line 9
    .line 10
    iget-object v2, p0, Ll9/b;->k:Lhg/b;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x4

    .line 30
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    div-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    int-to-short v0, v1

    .line 44
    iget-object v1, p0, Ll9/a;->j:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Ll9/a;->j:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object p1, p0, Ll9/a;->j:Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_2
    :goto_1
    return v1
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
.end method
