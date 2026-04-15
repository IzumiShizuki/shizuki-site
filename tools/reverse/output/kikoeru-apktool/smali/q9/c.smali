.class public final synthetic Lq9/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhf/y;

.field public final synthetic c:Lq9/r0;


# direct methods
.method public synthetic constructor <init>(ILhf/y;Lq9/r0;)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/c;->a:I

    iput-object p2, p0, Lq9/c;->b:Lhf/y;

    iput-object p3, p0, Lq9/c;->c:Lq9/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq9/r0;Lhf/y;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lq9/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/c;->c:Lq9/r0;

    iput-object p2, p0, Lq9/c;->b:Lhf/y;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lq9/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq9/c;->c:Lq9/r0;

    .line 7
    .line 8
    iget-object v1, v0, Lq9/r0;->f:Lx0/e1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v1, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lq9/l;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v1, v0, v2, v3}, Lq9/l;-><init>(Lq9/r0;Lyb/c;I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    iget-object v3, p0, Lq9/c;->b:Lhf/y;

    .line 22
    .line 23
    invoke-static {v3, v2, v2, v1, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    new-instance v0, Lq9/l;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iget-object v2, p0, Lq9/c;->c:Lq9/r0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v0, v2, v3, v1}, Lq9/l;-><init>(Lq9/r0;Lyb/c;I)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    iget-object v2, p0, Lq9/c;->b:Lhf/y;

    .line 40
    .line 41
    invoke-static {v2, v3, v3, v0, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_1
    new-instance v0, Lq9/l;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    iget-object v2, p0, Lq9/c;->c:Lq9/r0;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v0, v2, v3, v1}, Lq9/l;-><init>(Lq9/r0;Lyb/c;I)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    iget-object v2, p0, Lq9/c;->b:Lhf/y;

    .line 56
    .line 57
    invoke-static {v2, v3, v3, v0, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
