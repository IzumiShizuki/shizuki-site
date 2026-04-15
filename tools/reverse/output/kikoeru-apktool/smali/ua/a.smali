.class public final Lua/a;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Lta/c;

.field public final synthetic e:Lic/k;


# direct methods
.method public constructor <init>(Lj1/q;Lic/k;Lta/c;I)V
    .locals 0

    const/4 p4, 0x0

    iput p4, p0, Lua/a;->b:I

    .line 1
    iput-object p1, p0, Lua/a;->c:Lj1/q;

    iput-object p2, p0, Lua/a;->e:Lic/k;

    iput-object p3, p0, Lua/a;->d:Lta/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj1/q;Lta/c;Lic/k;I)V
    .locals 0

    const/4 p4, 0x1

    iput p4, p0, Lua/a;->b:I

    .line 2
    iput-object p1, p0, Lua/a;->c:Lj1/q;

    iput-object p2, p0, Lua/a;->d:Lta/c;

    iput-object p3, p0, Lua/a;->e:Lic/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lua/a;->b:I

    .line 2
    .line 3
    check-cast p1, Lx0/o;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lua/a;->e:Lic/k;

    .line 14
    .line 15
    const/16 v0, 0x6c37

    .line 16
    .line 17
    iget-object v1, p0, Lua/a;->c:Lj1/q;

    .line 18
    .line 19
    iget-object v2, p0, Lua/a;->d:Lta/c;

    .line 20
    .line 21
    invoke-static {v0, p2, v1, v2, p1}, Lua/j;->a(ILic/k;Lj1/q;Lta/c;Lx0/o;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object p2, p0, Lua/a;->d:Lta/c;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iget-object v1, p0, Lua/a;->e:Lic/k;

    .line 31
    .line 32
    iget-object v2, p0, Lua/a;->c:Lj1/q;

    .line 33
    .line 34
    invoke-static {v0, v1, v2, p2, p1}, Lnd/h;->a(ILic/k;Lj1/q;Lta/c;Lx0/o;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 38
    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
