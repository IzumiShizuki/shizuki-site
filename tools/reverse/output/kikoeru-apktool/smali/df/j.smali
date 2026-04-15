.class public final Ldf/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ldf/k;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lub/e;


# direct methods
.method public constructor <init>(Lic/a;Lic/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldf/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/j;->b:Ljava/lang/Object;

    iput-object p2, p0, Ldf/j;->c:Lub/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Lic/n;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldf/j;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/j;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Ldf/j;->c:Lub/e;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Ldf/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lef/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lef/b;-><init>(Ldf/j;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Ld1/c;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ld1/c;-><init>(Ldf/j;)V

    .line 15
    .line 16
    .line 17
    return-object v0

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
