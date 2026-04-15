.class public final Li3/l;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Lic/k;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lic/k;Lj1/q;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li3/l;->b:I

    .line 1
    iput-object p1, p0, Li3/l;->d:Lic/k;

    iput-object p2, p0, Li3/l;->c:Lj1/q;

    iput p3, p0, Li3/l;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lj1/q;Lic/k;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li3/l;->b:I

    .line 2
    iput-object p1, p0, Li3/l;->c:Lj1/q;

    iput-object p2, p0, Li3/l;->d:Lic/k;

    iput p3, p0, Li3/l;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li3/l;->b:I

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
    iget p2, p0, Li3/l;->e:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Li3/l;->d:Lic/k;

    .line 22
    .line 23
    iget-object v1, p0, Li3/l;->c:Lj1/q;

    .line 24
    .line 25
    invoke-static {p2, v0, v1, p1}, Lnh/b;->a(ILic/k;Lj1/q;Lx0/o;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_0
    iget p2, p0, Li3/l;->e:I

    .line 32
    .line 33
    or-int/lit8 p2, p2, 0x1

    .line 34
    .line 35
    invoke-static {p2}, Lx0/v;->D(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object v0, p0, Li3/l;->d:Lic/k;

    .line 40
    .line 41
    iget-object v1, p0, Li3/l;->c:Lj1/q;

    .line 42
    .line 43
    invoke-static {p2, v0, v1, p1}, Landroidx/compose/ui/viewinterop/a;->a(ILic/k;Lj1/q;Lx0/o;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
