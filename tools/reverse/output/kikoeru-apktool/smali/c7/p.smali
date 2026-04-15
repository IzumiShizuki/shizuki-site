.class public final Lc7/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc7/f0;Ljava/lang/Object;Lc7/s;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lc7/p;->g:Ljava/lang/Object;

    iput-object p3, p0, Lc7/p;->d:Ljava/lang/Object;

    iput-object p4, p0, Lc7/p;->e:Ljava/lang/Object;

    iput-object p5, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p2, p0, Lc7/p;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls8/i;Ljava/util/List;ILs8/i;Lt8/h;Lh8/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc7/p;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lc7/p;->d:Ljava/lang/Object;

    .line 4
    iput p3, p0, Lc7/p;->a:I

    .line 5
    iput-object p4, p0, Lc7/p;->e:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 7
    iput-object p6, p0, Lc7/p;->g:Ljava/lang/Object;

    .line 8
    iput-boolean p7, p0, Lc7/p;->b:Z

    return-void
.end method

.method public constructor <init>(Lug/a;Lxa/h;Lzg/n;Z)V
    .locals 1

    const-string p3, "routeDatabase"

    invoke-static {p2, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lc7/p;->d:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Lc7/p;->e:Ljava/lang/Object;

    .line 12
    iput-boolean p4, p0, Lc7/p;->b:Z

    .line 13
    sget-object p2, Lvb/r;->a:Lvb/r;

    iput-object p2, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lc7/p;->c:Ljava/lang/Object;

    .line 15
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lc7/p;->g:Ljava/lang/Object;

    .line 16
    iget-object p2, p1, Lug/a;->h:Lug/t;

    .line 17
    const-string p3, "url"

    invoke-static {p2, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Lug/t;->i()Ljava/net/URI;

    move-result-object p2

    .line 19
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x1

    const/4 v0, 0x0

    if-nez p3, :cond_0

    new-array p1, p4, [Ljava/net/Proxy;

    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    aput-object p2, p1, v0

    .line 20
    invoke-static {p1}, Lwg/g;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 21
    :cond_0
    iget-object p1, p1, Lug/a;->g:Ljava/net/ProxySelector;

    .line 22
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    .line 23
    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p1}, Lwg/g;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    new-array p1, p4, [Ljava/net/Proxy;

    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    aput-object p2, p1, v0

    .line 26
    invoke-static {p1}, Lwg/g;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 27
    :goto_1
    iput-object p1, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 28
    iput v0, p0, Lc7/p;->a:I

    return-void
.end method


# virtual methods
.method public a(Ls8/i;Ln8/g;)V
    .locals 4

    .line 1
    iget-object v0, p1, Ls8/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lc7/p;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ls8/i;

    .line 6
    .line 7
    iget-object v2, v1, Ls8/i;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v3, "Interceptor \'"

    .line 10
    .line 11
    if-ne v0, v2, :cond_4

    .line 12
    .line 13
    iget-object v0, p1, Ls8/i;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v2, Ls8/k;->a:Ls8/k;

    .line 16
    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    iget-object v0, p1, Ls8/i;->c:Lu8/a;

    .line 20
    .line 21
    iget-object v2, v1, Ls8/i;->c:Lu8/a;

    .line 22
    .line 23
    if-ne v0, v2, :cond_2

    .line 24
    .line 25
    iget-object v0, p1, Ls8/i;->u:Landroidx/lifecycle/q;

    .line 26
    .line 27
    iget-object v2, v1, Ls8/i;->u:Landroidx/lifecycle/q;

    .line 28
    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    iget-object p1, p1, Ls8/i;->v:Lt8/i;

    .line 32
    .line 33
    iget-object v0, v1, Ls8/i;->v:Lt8/i;

    .line 34
    .line 35
    if-ne p1, v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p2, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p2, "\' cannot modify the request\'s lifecycle."

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p2

    .line 92
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p2, "\' cannot modify the request\'s target."

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2

    .line 119
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p2, "\' cannot set the request\'s data to null."

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p2

    .line 146
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p2, "\' cannot modify the request\'s context."

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p2
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public b()Z
    .locals 2

    .line 1
    iget v0, p0, Lc7/p;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lc7/p;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
    .line 28
    .line 29
.end method

.method public c(Ls8/i;Lac/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lc7/p;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget v1, p0, Lc7/p;->a:I

    .line 6
    .line 7
    instance-of v2, p2, Ln8/h;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    check-cast v2, Ln8/h;

    .line 13
    .line 14
    iget v3, v2, Ln8/h;->h:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, Ln8/h;->h:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Ln8/h;

    .line 27
    .line 28
    invoke-direct {v2, p0, p2}, Ln8/h;-><init>(Lc7/p;Lac/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v2, Ln8/h;->f:Ljava/lang/Object;

    .line 32
    .line 33
    iget v3, v2, Ln8/h;->h:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v2, Ln8/h;->e:Ln8/g;

    .line 41
    .line 42
    iget-object v0, v2, Ln8/h;->d:Lc7/p;

    .line 43
    .line 44
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-lez v1, :cond_3

    .line 60
    .line 61
    add-int/lit8 p2, v1, -0x1

    .line 62
    .line 63
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Ln8/g;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Lc7/p;->a(Ls8/i;Ln8/g;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    check-cast p2, Ln8/g;

    .line 77
    .line 78
    add-int/lit8 v8, v1, 0x1

    .line 79
    .line 80
    iget-object v0, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v10, v0

    .line 83
    check-cast v10, Lt8/h;

    .line 84
    .line 85
    new-instance v5, Lc7/p;

    .line 86
    .line 87
    iget-object v0, p0, Lc7/p;->c:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, v0

    .line 90
    check-cast v6, Ls8/i;

    .line 91
    .line 92
    iget-object v0, p0, Lc7/p;->d:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v7, v0

    .line 95
    check-cast v7, Ljava/util/List;

    .line 96
    .line 97
    iget-object v0, p0, Lc7/p;->g:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v11, v0

    .line 100
    check-cast v11, Lh8/c;

    .line 101
    .line 102
    iget-boolean v12, p0, Lc7/p;->b:Z

    .line 103
    .line 104
    move-object v9, p1

    .line 105
    invoke-direct/range {v5 .. v12}, Lc7/p;-><init>(Ls8/i;Ljava/util/List;ILs8/i;Lt8/h;Lh8/c;Z)V

    .line 106
    .line 107
    .line 108
    iput-object p0, v2, Ln8/h;->d:Lc7/p;

    .line 109
    .line 110
    iput-object p2, v2, Ln8/h;->e:Ln8/g;

    .line 111
    .line 112
    iput v4, v2, Ln8/h;->h:I

    .line 113
    .line 114
    invoke-virtual {p2, v5, v2}, Ln8/g;->d(Lc7/p;Lac/c;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 119
    .line 120
    if-ne p1, v0, :cond_4

    .line 121
    .line 122
    return-object v0

    .line 123
    :cond_4
    move-object v0, p2

    .line 124
    move-object p2, p1

    .line 125
    move-object p1, v0

    .line 126
    move-object v0, p0

    .line 127
    :goto_1
    check-cast p2, Ls8/j;

    .line 128
    .line 129
    invoke-virtual {p2}, Ls8/j;->b()Ls8/i;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v1, p1}, Lc7/p;->a(Ls8/i;Ln8/g;)V

    .line 134
    .line 135
    .line 136
    return-object p2
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public d()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lc7/p;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lc7/p;->b:Z

    .line 7
    .line 8
    iget-object v1, p0, Lc7/p;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/os/Bundle;

    .line 11
    .line 12
    iget-object v2, p0, Lc7/p;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Lc7/p;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lc7/f0;

    .line 19
    .line 20
    iget-object v3, v3, Lc7/f0;->e:Lo/e;

    .line 21
    .line 22
    iget-object v4, p0, Lc7/p;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Lc7/s;

    .line 25
    .line 26
    iget-object v5, v4, Lc7/s;->e:Lc7/n;

    .line 27
    .line 28
    iget-object v6, v4, Lc7/s;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v7, v5, Lc7/n;->a:Landroid/os/Messenger;

    .line 34
    .line 35
    invoke-virtual {v7}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v3, v7}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v7, "MBServiceCompat"

    .line 44
    .line 45
    if-eq v3, v4, :cond_0

    .line 46
    .line 47
    sget-boolean v0, Lc7/f0;->i:Z

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "Not sending onLoadChildren result for connection that has been disconnected. pkg="

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, " id="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget v3, p0, Lc7/p;->a:I

    .line 78
    .line 79
    and-int/2addr v0, v3

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    sget-boolean v0, Lc7/f0;->i:Z

    .line 83
    .line 84
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v0, Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v3, "data_media_item_id"

    .line 93
    .line 94
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v3, "data_options"

    .line 98
    .line 99
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    const-string v1, "data_notify_children_changed_options"

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x3

    .line 109
    invoke-virtual {v5, v1, v0}, Lc7/n;->b(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v1, "Calling onLoadChildren() failed for id="

    .line 116
    .line 117
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, " package="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_0
    return-void

    .line 139
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v2, "sendResult() called when either sendResult() or sendError() had already been called for: "

    .line 144
    .line 145
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v2, p0, Lc7/p;->c:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method
