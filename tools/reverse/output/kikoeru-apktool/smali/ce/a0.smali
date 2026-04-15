.class public final Lce/a0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final a:Lce/z;

.field public b:Lce/v;

.field public c:I


# direct methods
.method public constructor <init>(Lce/b0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lce/z;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lce/z;-><init>(Lce/e;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lce/a0;->a:Lce/z;

    .line 10
    .line 11
    invoke-virtual {v0}, Lce/z;->a()Lce/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lce/v;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lce/v;-><init>(Lce/w;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lce/a0;->b:Lce/v;

    .line 21
    .line 22
    iget p1, p1, Lce/b0;->b:I

    .line 23
    .line 24
    iput p1, p0, Lce/a0;->c:I

    .line 25
    .line 26
    return-void
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


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lce/a0;->c:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
    .line 9
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

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lce/a0;->b:Lce/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Lce/v;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lce/a0;->a:Lce/z;

    .line 10
    .line 11
    invoke-virtual {v0}, Lce/z;->a()Lce/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lce/v;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lce/v;-><init>(Lce/w;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lce/a0;->b:Lce/v;

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lce/a0;->c:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Lce/a0;->c:I

    .line 27
    .line 28
    iget-object v0, p0, Lce/a0;->b:Lce/v;

    .line 29
    .line 30
    invoke-virtual {v0}, Lce/v;->a()B

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
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

.method public final remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
    .line 7
    .line 8
    .line 9
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
