.class public final Li7/v1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/f;

.field public final synthetic c:Lac/i;


# direct methods
.method public constructor <init>(Lic/n;Llf/f;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li7/v1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    check-cast p1, Lac/i;

    iput-object p1, p0, Li7/v1;->c:Lac/i;

    iput-object p2, p0, Li7/v1;->b:Llf/f;

    return-void
.end method

.method public constructor <init>(Llf/f;Lic/n;I)V
    .locals 0

    iput p3, p0, Li7/v1;->a:I

    packed-switch p3, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Li7/v1;->b:Llf/f;

    check-cast p2, Lac/i;

    iput-object p2, p0, Li7/v1;->c:Lac/i;

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Li7/v1;->b:Llf/f;

    check-cast p2, Lac/i;

    iput-object p2, p0, Li7/v1;->c:Lac/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(Llf/g;Lyb/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Li7/v1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Llf/o;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Llf/o;

    .line 12
    .line 13
    iget v1, v0, Llf/o;->e:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Llf/o;->e:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Llf/o;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Llf/o;-><init>(Li7/v1;Lyb/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Llf/o;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Llf/o;->e:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

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
    iget-object p1, v0, Llf/o;->i:Lmf/p;

    .line 57
    .line 58
    iget-object v1, v0, Llf/o;->h:Llf/g;

    .line 59
    .line 60
    iget-object v3, v0, Llf/o;->g:Li7/v1;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p2

    .line 67
    goto :goto_4

    .line 68
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance p2, Lmf/p;

    .line 72
    .line 73
    iget-object v1, v0, Lac/c;->b:Lyb/h;

    .line 74
    .line 75
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, p1, v1}, Lmf/p;-><init>(Llf/g;Lyb/h;)V

    .line 79
    .line 80
    .line 81
    :try_start_1
    iget-object v1, p0, Li7/v1;->c:Lac/i;

    .line 82
    .line 83
    iput-object p0, v0, Llf/o;->g:Li7/v1;

    .line 84
    .line 85
    iput-object p1, v0, Llf/o;->h:Llf/g;

    .line 86
    .line 87
    iput-object p2, v0, Llf/o;->i:Lmf/p;

    .line 88
    .line 89
    iput v3, v0, Llf/o;->e:I

    .line 90
    .line 91
    invoke-interface {v1, p2, v0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    if-ne v1, v4, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move-object v3, p0

    .line 99
    move-object v1, p1

    .line 100
    move-object p1, p2

    .line 101
    :goto_1
    invoke-virtual {p1}, Lac/c;->w()V

    .line 102
    .line 103
    .line 104
    iget-object p1, v3, Li7/v1;->b:Llf/f;

    .line 105
    .line 106
    const/4 p2, 0x0

    .line 107
    iput-object p2, v0, Llf/o;->g:Li7/v1;

    .line 108
    .line 109
    iput-object p2, v0, Llf/o;->h:Llf/g;

    .line 110
    .line 111
    iput-object p2, v0, Llf/o;->i:Lmf/p;

    .line 112
    .line 113
    iput v2, v0, Llf/o;->e:I

    .line 114
    .line 115
    invoke-interface {p1, v1, v0}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v4, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    :goto_2
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 123
    .line 124
    :goto_3
    return-object v4

    .line 125
    :catchall_1
    move-exception p1

    .line 126
    move-object v5, p2

    .line 127
    move-object p2, p1

    .line 128
    move-object p1, v5

    .line 129
    :goto_4
    invoke-virtual {p1}, Lac/c;->w()V

    .line 130
    .line 131
    .line 132
    throw p2

    .line 133
    :pswitch_0
    new-instance v0, Li7/u1;

    .line 134
    .line 135
    iget-object v1, p0, Li7/v1;->c:Lac/i;

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    invoke-direct {v0, p1, v1, v2}, Li7/u1;-><init>(Llf/g;Lic/n;I)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Li7/v1;->b:Llf/f;

    .line 142
    .line 143
    invoke-interface {p1, v0, p2}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 148
    .line 149
    if-ne p1, p2, :cond_6

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_6
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 153
    .line 154
    :goto_5
    return-object p1

    .line 155
    :pswitch_1
    new-instance v0, Li7/u1;

    .line 156
    .line 157
    iget-object v1, p0, Li7/v1;->c:Lac/i;

    .line 158
    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v0, p1, v1, v2}, Li7/u1;-><init>(Llf/g;Lic/n;I)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Li7/v1;->b:Llf/f;

    .line 164
    .line 165
    invoke-interface {p1, v0, p2}, Llf/f;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 170
    .line 171
    if-ne p1, p2, :cond_7

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_7
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 175
    .line 176
    :goto_6
    return-object p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
