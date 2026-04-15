.class public final Lx0/j0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkc/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lx0/a2;

.field public final c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Lx0/a2;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx0/j0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/j0;->b:Lx0/a2;

    iput p3, p0, Lx0/j0;->c:I

    .line 2
    iput p2, p0, Lx0/j0;->d:I

    .line 3
    iget p2, p1, Lx0/a2;->h:I

    .line 4
    iput p2, p0, Lx0/j0;->e:I

    .line 5
    iget-boolean p1, p1, Lx0/a2;->g:Z

    if-eqz p1, :cond_0

    .line 6
    invoke-static {}, Lx0/c2;->f()V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lx0/a2;ILx0/k0;Lx0/v;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lx0/j0;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lx0/j0;->b:Lx0/a2;

    .line 9
    iput p2, p0, Lx0/j0;->c:I

    .line 10
    iget p1, p1, Lx0/a2;->h:I

    .line 11
    iput p1, p0, Lx0/j0;->d:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lx0/j0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0

    .line 8
    :pswitch_0
    iget v0, p0, Lx0/j0;->d:I

    .line 9
    .line 10
    iget v1, p0, Lx0/j0;->c:I

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .locals 4

    .line 1
    iget v0, p0, Lx0/j0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0

    .line 8
    :pswitch_0
    iget-object v0, p0, Lx0/j0;->b:Lx0/a2;

    .line 9
    .line 10
    iget v1, v0, Lx0/a2;->h:I

    .line 11
    .line 12
    iget v2, p0, Lx0/j0;->e:I

    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lx0/c2;->f()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lx0/j0;->d:I

    .line 20
    .line 21
    iget-object v3, v0, Lx0/a2;->a:[I

    .line 22
    .line 23
    invoke-static {v3, v1}, Lx0/c2;->a([II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    iput v3, p0, Lx0/j0;->d:I

    .line 29
    .line 30
    new-instance v3, Lx0/b2;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v2}, Lx0/b2;-><init>(Lx0/a2;II)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Lx0/j0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
