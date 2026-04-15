.class public final synthetic Lm0/l2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lq9/o;ZLbg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lm0/l2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/l2;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lm0/l2;->b:Z

    iput-object p3, p0, Lm0/l2;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLm0/t2;Lhf/y;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lm0/l2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm0/l2;->b:Z

    iput-object p2, p0, Lm0/l2;->c:Ljava/lang/Object;

    iput-object p3, p0, Lm0/l2;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm0/l2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/l2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lq9/o;

    .line 9
    .line 10
    iget-object v1, p0, Lm0/l2;->d:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v7, v1

    .line 13
    check-cast v7, Lbg/p;

    .line 14
    .line 15
    new-instance v2, Lq9/q;

    .line 16
    .line 17
    iget-object v1, v0, Lq9/o;->e:Lfg/f;

    .line 18
    .line 19
    invoke-virtual {v1}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v3, v1

    .line 24
    check-cast v3, Lbg/p0;

    .line 25
    .line 26
    iget-object v1, v0, Lq9/o;->f:Lfg/f;

    .line 27
    .line 28
    invoke-virtual {v1}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v4, v1

    .line 33
    check-cast v4, Lbg/u;

    .line 34
    .line 35
    iget-object v0, v0, Lq9/o;->g:Lx0/e1;

    .line 36
    .line 37
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v5, v0

    .line 42
    check-cast v5, Lbg/d;

    .line 43
    .line 44
    iget-boolean v6, p0, Lm0/l2;->b:Z

    .line 45
    .line 46
    invoke-direct/range {v2 .. v7}, Lq9/q;-><init>(Lbg/p0;Lbg/u;Lbg/d;ZLbg/p;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_0
    iget-object v0, p0, Lm0/l2;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lm0/t2;

    .line 53
    .line 54
    iget-object v1, p0, Lm0/l2;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lhf/y;

    .line 57
    .line 58
    iget-boolean v2, p0, Lm0/l2;->b:Z

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    iget-object v2, v0, Lm0/t2;->a:Lm0/x;

    .line 63
    .line 64
    iget-object v2, v2, Lm0/x;->d:Lic/k;

    .line 65
    .line 66
    sget-object v3, Lm0/u2;->a:Lm0/u2;

    .line 67
    .line 68
    invoke-interface {v2, v3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    new-instance v2, Lm0/o2;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-direct {v2, v0, v4, v3}, Lm0/o2;-><init>(Lm0/t2;Lyb/c;I)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x3

    .line 88
    invoke-static {v1, v4, v4, v2, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 89
    .line 90
    .line 91
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 92
    .line 93
    return-object v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 96
    .line 97
    .line 98
.end method
