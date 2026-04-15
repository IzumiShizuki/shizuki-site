.class public final synthetic Lv4/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lp4/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm4/u1;


# direct methods
.method public synthetic constructor <init>(Lm4/u1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lv4/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/r;->b:Lm4/u1;

    return-void
.end method

.method public synthetic constructor <init>(Lw4/a;Lm4/u1;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput p1, p0, Lv4/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv4/r;->b:Lm4/u1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lv4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw4/i;

    .line 7
    .line 8
    iget-object v0, p1, Lw4/i;->o:Lah/j;

    .line 9
    .line 10
    iget-object v1, p0, Lv4/r;->b:Lm4/u1;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, Lah/j;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lm4/q;

    .line 17
    .line 18
    iget v3, v2, Lm4/q;->v:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Lm4/q;->a()Lm4/p;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v3, v1, Lm4/u1;->a:I

    .line 28
    .line 29
    iput v3, v2, Lm4/p;->t:I

    .line 30
    .line 31
    iget v3, v1, Lm4/u1;->b:I

    .line 32
    .line 33
    iput v3, v2, Lm4/p;->u:I

    .line 34
    .line 35
    new-instance v3, Lm4/q;

    .line 36
    .line 37
    invoke-direct {v3, v2}, Lm4/q;-><init>(Lm4/p;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lah/j;

    .line 41
    .line 42
    iget v4, v0, Lah/j;->b:I

    .line 43
    .line 44
    iget-object v0, v0, Lah/j;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    const/16 v5, 0xe

    .line 49
    .line 50
    invoke-direct {v2, v3, v4, v0, v5}, Lah/j;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p1, Lw4/i;->o:Lah/j;

    .line 54
    .line 55
    :cond_0
    iget p1, v1, Lm4/u1;->a:I

    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    iget-object v0, p0, Lv4/r;->b:Lm4/u1;

    .line 59
    .line 60
    check-cast p1, Lm4/w0;

    .line 61
    .line 62
    invoke-interface {p1, v0}, Lm4/w0;->F(Lm4/u1;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
