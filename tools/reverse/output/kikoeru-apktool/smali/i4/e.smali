.class public final Li4/e;
.super Li4/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 6
    sget-object v0, Li4/a;->b:Li4/a;

    .line 7
    invoke-direct {p0, v0}, Li4/e;-><init>(Li4/b;)V

    return-void
.end method

.method public constructor <init>(Li4/b;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p1, Li4/b;->a:Ljava/util/LinkedHashMap;

    .line 2
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Li4/b;-><init>()V

    .line 4
    iget-object v0, p0, Li4/b;->a:Ljava/util/LinkedHashMap;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Lpe/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/b;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
