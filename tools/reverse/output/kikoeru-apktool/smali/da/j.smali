.class public final synthetic Lda/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc0/z;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lda/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/j;->c:Ljava/lang/Object;

    iput p2, p0, Lda/j;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Lda/m0;Lda/b;I)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Lda/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lda/j;->c:Ljava/lang/Object;

    iput p3, p0, Lda/j;->b:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lda/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lc0/z;

    .line 9
    .line 10
    iget-object v0, v0, Lc0/z;->c:Lc0/s;

    .line 11
    .line 12
    iget-object v0, v0, Lc0/s;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx0/b1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v1, p0, Lda/j;->b:I

    .line 21
    .line 22
    if-le v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_0
    iget-object v0, p0, Lda/j;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lda/b;

    .line 35
    .line 36
    iget v1, p0, Lda/j;->b:I

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {v0, v1, v2}, Lda/m0;->T(Lda/b;ILs2/a;)V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
