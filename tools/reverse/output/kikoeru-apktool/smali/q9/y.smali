.class public final synthetic Lq9/y;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq9/r0;

.field public final synthetic c:Lbg/p;

.field public final synthetic d:Lhf/y;


# direct methods
.method public synthetic constructor <init>(Lhf/y;Lq9/r0;Lbg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq9/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/y;->d:Lhf/y;

    iput-object p2, p0, Lq9/y;->b:Lq9/r0;

    iput-object p3, p0, Lq9/y;->c:Lbg/p;

    return-void
.end method

.method public synthetic constructor <init>(Lq9/r0;Lbg/p;Lhf/y;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lq9/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/y;->b:Lq9/r0;

    iput-object p2, p0, Lq9/y;->c:Lbg/p;

    iput-object p3, p0, Lq9/y;->d:Lhf/y;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lq9/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/y;->b:Lq9/r0;

    .line 7
    .line 8
    iget-object v1, v0, Lq9/r0;->f:Lx0/e1;

    .line 9
    .line 10
    iget-object v2, p0, Lq9/y;->c:Lbg/p;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lq9/l;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v1, v0, v3, v2}, Lq9/l;-><init>(Lq9/r0;Lyb/c;I)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    iget-object v2, p0, Lq9/y;->d:Lhf/y;

    .line 24
    .line 25
    invoke-static {v2, v3, v3, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    new-instance v0, Lq9/l;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    iget-object v2, p0, Lq9/y;->b:Lq9/r0;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v0, v2, v3, v1}, Lq9/l;-><init>(Lq9/r0;Lyb/c;I)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lq9/y;->d:Lhf/y;

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    invoke-static {v1, v3, v3, v0, v4}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 44
    .line 45
    .line 46
    new-instance v0, Lq9/f0;

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    iget-object v6, p0, Lq9/y;->c:Lbg/p;

    .line 50
    .line 51
    invoke-direct {v0, v6, v2, v3, v5}, Lq9/f0;-><init>(Lbg/p;Lq9/r0;Lyb/c;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v3, v3, v0, v4}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
